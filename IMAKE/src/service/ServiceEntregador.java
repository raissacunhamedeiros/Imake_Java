package service;
import model.Entregador;
import java.util.ArrayList;

public class ServiceEntregador {
    private final ArrayList<Entregador> entregadores = new ArrayList<>();

    //métodos
    public void cadastrarEntregador(Entregador entregador){
        entregadores.add(entregador);
        System.out.println("Entregador cadastrado com sucesso!");
    }

    public void exibirEntregadores(){
        System.out.println("Entregadores cadastrados: ");
        for (Entregador entregador : entregadores) {
            System.out.println("-> " + entregador);
        }
    }

    public void buscarEntregador(String cpf) {
        for (Entregador entregador : entregadores) {
            if (entregador.getCpf().equals(cpf)){
                System.out.println("Entregador: " + entregador);
                return;
            }
        }
        System.out.println("CPF não cadastrado!");
    }

    public void atualizarEntregador(String nome, String cpf, String telefone, String email, String endereco, String meioEntrega){
        for (Entregador entregador : entregadores) {
            if (entregador.getCpf().equals(cpf)) {
                entregador.setNome(nome);
                entregador.setCpf(cpf);
                entregador.setTelefone(telefone);
                entregador.setEmail(email);
                entregador.setEndereco(endereco);
                entregador.setMeioEntrega(meioEntrega);
                System.out.println("Dados atualizados!");
                return; //p parar o laço
            }
        }
        System.out.println("CPF não encontrado. Digite um CPF válido.");
    }

    public void removerEntregador(String cpf){
        for (int i = 0; i < entregadores.size(); i++){
            if (entregadores.get(i).getCpf().equals(cpf)) { //pega o entreg. da posição i - pega o cpf deste - comparar (equals) com o cpf digitado - sendo igual, exclui e adeus
                System.out.println("Entregado removido: " + entregadores.get(i).getNome());
                entregadores.remove(i);
                return; //p/ parar pós-remoção
            }

        }
        System.out.println("CPF não encontrado.");
    }
}
