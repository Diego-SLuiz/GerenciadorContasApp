package sistemaAguaLuz.model;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private String celular;
    private Endereco endereco;
    private ArrayList<Contrato> listaContratos;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public Cliente() {
        listaContratos = new ArrayList<Contrato>();
    }

    public void addContrato(Contrato contrato) {
        listaContratos.add(contrato);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", celular='" + celular + '\'' +
                ", endereco=" + endereco +
                ", listaContratos=" + listaContratos +
                '}';
    }
}
