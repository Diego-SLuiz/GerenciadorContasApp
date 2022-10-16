package sistemaAguaLuz.model;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CarregarArquivoContrato {
    public static void  carregarContrato(Contrato contrato) {

        //Contrato contrato1 = new Contrato();
        contrato.getCliente().getNome();
        contrato.getCliente().getCpf();
        contrato.getCliente().getRg();

        contrato.getCliente().getEndereco().getLogradouro();
        contrato.getCliente().getEndereco().getNumero();
        contrato.getCliente().getEndereco().getBairro();
        contrato.getCliente().getEndereco().getComplemento();
        contrato.getCliente().getEndereco().getCidade();
        contrato.getCliente().getEndereco().getCep();
        contrato.getCliente().getEndereco().getUf();
        contrato.getCliente().getEndereco().getEnumPais().getSigla();

        contrato.getData();
        Date
        String hora = contrato.getHora().("dd/MM").toString().replaceAll("\\D", "");
        contrato.getProtocolo();
        contrato.getTipoNotificacao().getSigla();
        contrato.getTipoServico();
        contrato.getTipoServico().getValor();

        System.out.println(contrato);


       // try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))

    }
}
