package model;
import Enum.*;

public class Entregador extends Pessoa{
    private String meioEntrega;
    private final TipoPessoa tipoPessoa = TipoPessoa.ENTREGADOR;
    //sera sempre tipo entregador, nao podendo ser alterado

    //construtores
    public Entregador(TipoPessoa tipoPessoa, String nome, String cpf, String telefone, String email, String endereco, String senha){
        super(nome, cpf, telefone, email, endereco, senha);
    } //finalizar const Pessoa

    //get e set
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public String getMeioEntrega() {
        return meioEntrega;
    }

    public void setMeioEntrega(String meioEntrega) {
        this.meioEntrega = meioEntrega;
    }

    //toString
    @Override
    public String toString(){
        return tipoPessoa + super.toString();
    }
}
