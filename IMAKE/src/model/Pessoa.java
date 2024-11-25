package model;

public abstract class Pessoa {
    //atributos
    protected String nome, cpf, telefone, email, endereco, senha;

    //construtores
    public Pessoa(String nome, String cpf, String telefone, String email, String endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) { //verificação cpf 11 dig - numeros
        String cpfNum = cpf.replaceAll("\\D", ""); //o que nao for numero, substitui por vazio
        if (cpfNum.length() == 11){
            this.cpf = cpfNum;
        } else {
            System.out.println("CPF inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //toString
    @Override
    public String toString(){
        return "Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone +
                " | Email: " + email + " | Endereço: " + endereco;
    }
}

//abstract - cliente e entreg. devem ter esses atributos