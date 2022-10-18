package sistemaAguaLuz.model;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

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

    public String exibirContrato() {
        StringBuilder notificacao = new StringBuilder();
        Contrato contrato = listaContratos.get(0);
        Locale ptBr = new Locale("pt", "BR");

        notificacao.append("Senhor(a) ").append(nome).append(" ");
        notificacao.append("Cpf de numero ").append(cpf).append(", ");
        notificacao.append("informamos que conforme contrato com protocolo de numero ").append(contrato.getProtocolo()).append(" ");
        notificacao.append("esta agendada para data ").append(contrato.getData().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).append(" ");
        notificacao.append("e hora ").append(contrato.getHora().format(DateTimeFormatter.ofPattern("hh:mm"))).append(" ");
        notificacao.append("a instalacao do servico de ").append(contrato.getTipoServico()).append(" ");
        notificacao.append("com taxa de valor ").append(NumberFormat.getCurrencyInstance(ptBr).format(contrato.getTipoServico().getValor())).append(" ");
        notificacao.append("em sua residencia localizada no endereco abaixo:\n");
        notificacao.append("Logradouro: ").append(endereco.getLogradouro()).append(", ").append(endereco.getNumero()).append("\n");
        notificacao.append("Complemento: ").append(endereco.getComplemento()).append("\n");
        notificacao.append("Bairro: ").append(endereco.getBairro()).append("\n");
        notificacao.append("Cidade: ").append(endereco.getCidade()).append("\n");
        notificacao.append("Cep: ").append(endereco.getCep()).append("\n");

        return notificacao.toString();
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
