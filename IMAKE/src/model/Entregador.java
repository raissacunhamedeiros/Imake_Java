package model;
import Enum.*;

public class Entregador extends Pessoa{
    private String meioEntrega;
    private final TipoPessoa tipoPessoa = TipoPessoa.ENTREGADOR;
    private int totalEntregas;
    private double totalComissoes;


    //construtor
    public Entregador(String nome, String cpf, String telefone, String email, String endereco, String senha){
        super(nome, cpf, telefone, email, endereco, senha);
        this.totalEntregas = 0;
        this.totalComissoes = 0.0;
    } //meio de entrega não fica obrigatório p/ cadastro de entregador - pode ser alt. depois

    //get e set
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public String getMeioEntrega() {
        return meioEntrega;
    }

    public int getTotalEntregas() {
        return totalEntregas;
    }

    public double getTotalComissoes() {
        return totalComissoes;
    }

    public void setMeioEntrega(String meioEntrega) {
        if (!meioEntrega.equalsIgnoreCase("bicicleta") &&
        !meioEntrega.equalsIgnoreCase("moto") &&
        !meioEntrega.equalsIgnoreCase("carro")){
            System.out.println("Meio inválido! Meios válidos: bicicleta, moto ou carro.");
        } else {
            this.meioEntrega = meioEntrega;
        }
    }

    //métodos
    // usei valorVenda - como valor total da venda para gerar a comissão dele
    public void concluirEntrega(double valorVenda){
        double comissao;
        if (valorVenda >= 100.0) {comissao = 10.0;}
        else {comissao = 7.0;}

        totalEntregas++;
        totalComissoes += comissao;

        System.out.println("Entrega finalizada. Comissao - R$: " + comissao);
    }

    public void exibirEntregas(){
        System.out.println("Total de entregas finalizadas: " + totalEntregas);
    }

    public void exibirComissoes(){
        System.out.println("Total de comissões - R$: " + totalComissoes);
    }

    //toString
    @Override
    public String toString(){
        return tipoPessoa + super.toString() + " | Meio de Entrega: " + (meioEntrega != null ? meioEntrega : "A definir") +
                "\nTotal de entregas: " + totalEntregas +
                "\nTotal comissões - R$: " + String.format("%.2f", totalComissoes);
    }






}
