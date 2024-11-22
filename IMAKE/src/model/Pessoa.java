package model;

public abstract class Pessoa {
    //atributos
    protected String nome, cpf, telefone, email, endereco, senha;

    //construtores


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

    public void setCpf(String cpf) {
        this.cpf = cpf;
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