package sistemaAguaLuz.model;

public class Endereco {
    private String logradouro;
    private String complemento;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String  uf;

    public Endereco(String logradouro, String complemento, Integer numero, String bairro, String cidade, String cep, String uf) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }
}
