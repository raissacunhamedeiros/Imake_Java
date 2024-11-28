package service;
import model.Cliente;
import model.Entregador;
import java.util.ArrayList;

public class ServiceCliente {
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    //métodos

    //verificar email e senha
    public boolean verificarInfos(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarCliente(Cliente cliente){
        for (Cliente c : clientes){
            if (c.getCpf().equals(cliente.getCpf())){
                System.out.println("CPF já cadastrado" + c);
                return;
            }
        }
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void exibirClientes(){
        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente foi cadastrado ainda.");
            return;
        }
        System.out.println("Clientes cadastrados:");
        int contadorClientes = 1;
        for (Cliente cliente : clientes) {
            System.out.println(contadorClientes++ + ": " + cliente);
        }
    }

    public void buscarCliente(String cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente encontrado: " + cliente);
                return; //encerra busca
            }
        }
        System.out.println("CPF não cadastrado!");
    }

    public void atualizarCliente(String nome, String cpf, String telefone, String email, String endereco){
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equals(cpf)){
                cliente.setNome(nome);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                cliente.setEndereco(endereco);
                System.out.println("Dados atualizados!");
                return;
            }
        }
        System.out.println("CPF não cadastrado!");
    }

    public void removerCliente(String cpf){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)){
                System.out.println("Cliente removido: " + clientes.get(i).getNome());
                clientes.remove(i);
                return;
            }
        }
        System.out.println("CPF não cadastrado!");
    }

}
