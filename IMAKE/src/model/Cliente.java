package model;
import Enum.*;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private final TipoPessoa tipoPessoa = TipoPessoa.CLIENTE;
    private Carrinho carrinho;
    //sera sempre tipo cliente, nao podendo ser alterado

    //construtores
    public Cliente(String nome, String cpf, String telefone, String email, String endereco, String senha){
        super(nome, cpf, telefone, email, endereco,senha);
        this.carrinho = new Carrinho(new service.ServiceCarrinho());
    }

    //get
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }
    public Carrinho getCarrinho(){return carrinho;}

    //métodos
    public void chamarCarrinho(){
        System.out.println("Itens carrinhos: " + getNome() + ":");
        carrinho.exibirCarrinho();

    }

    public void escolherPagamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Forma de pagamento: ");
        System.out.println("Opções disponíveis:");
        System.out.println("[1] Cartão de Crédito");
        System.out.println("[2] Pix");

        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1 -> System.out.println("Forma de pagamento escolhida: Cartão de Crédito.");
            case 2 -> System.out.println("Forma de pagamento escolhida: Pix.");
            default -> System.out.println("Opção inválida!");
        }
    }

    //toString
    @Override
    public String toString(){
        return tipoPessoa + super.toString();
    }
}
