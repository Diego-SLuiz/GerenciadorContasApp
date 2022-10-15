package sistemaAguaLuz.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String rg;

    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        cpf.replaceAll(". || -", "");
        if(cpf == null || cpf.length() < 11){
            throw new IllegalArgumentException("Digite um CPF válido");
        }
        return  this.cpf = cpf;
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
                '}';
    }
}
