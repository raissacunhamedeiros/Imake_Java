package model;
import Enum.*;

public class Cliente extends Pessoa {
    private final TipoPessoa tipoPessoa = TipoPessoa.CLIENTE;
    //sera sempre tipo cliente, nao podendo ser alterado

    //construtores
    public Cliente(TipoPessoa tipoPessoa, String nome, String cpf, String telefone, String email, String endereco, String senha){
        super(nome, cpf, telefone, email, endereco,senha);
    } //finalizar construtor Pessoa

    //get
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    //toString
    @Override
    public String toString(){
        return tipoPessoa + super.toString();
    }
}
