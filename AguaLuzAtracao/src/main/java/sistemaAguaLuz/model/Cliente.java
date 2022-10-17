package sistemaAguaLuz.model;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private String celular;
    private Endereco endereco;
    private ArrayList<Contrato> listaContratos;

    public Cliente() {
        listaContratos = new ArrayList<Contrato>();
    }

    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public void addContrato(Contrato contrato) {
        listaContratos.add(contrato);
    }

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
        cpf.replaceAll(". || -", "");
        if (cpf == null || cpf.length() < 11) {
            throw new IllegalArgumentException("Digite um CPF válido");
        }
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco=" + endereco +
                "celular  = " + celular +
                '}';
    }
}
