package sistemaAguaLuz.application;

import sistemaAguaLuz.enumeration.EnumPais;
import sistemaAguaLuz.enumeration.EnumTipoNotificacao;
import sistemaAguaLuz.enumeration.EnumTipoServico;
import sistemaAguaLuz.model.Cliente;
import sistemaAguaLuz.model.Contrato;
import sistemaAguaLuz.model.Endereco;
import sistemaAguaLuz.model.GerarArquivoContrato;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        // Criando objeto endereço
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua amarela");
        endereco.setNumero(109);
        endereco.setComplemento("Bloco 1");
        endereco.setBairro("Alphaville");
        endereco.setCep("05849-100");
        endereco.setCidade("Barueri");
        endereco.setUf("SP");
        endereco.setEnumPais(EnumPais.BRASIL);

        // Criando objeto contrato
        Contrato contrato1 = new Contrato();
        contrato1.setData(LocalDate.now().plusDays(10));
        contrato1.setHora(LocalTime.now());
        contrato1.setTipoServico(EnumTipoServico.LUZ);
        contrato1.setTipoNotificacao(EnumTipoNotificacao.WHATSAPP);

        Contrato contrato2 = new Contrato();
        contrato2.setData(LocalDate.now().plusDays(10));
        contrato2.setHora(LocalTime.now());
        contrato2.setTipoServico(EnumTipoServico.AGUA);
        contrato2.setTipoNotificacao(EnumTipoNotificacao.WHATSAPP);

        Contrato contrato3 = new Contrato();
        contrato3.setData(LocalDate.now().plusDays(10));
        contrato3.setHora(LocalTime.now());
        contrato3.setTipoServico(EnumTipoServico.LUZ);
        contrato3.setTipoNotificacao(EnumTipoNotificacao.SMS);

        // Criando objeto cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo diCaprio da Silva");
        cliente.setCpf("400.300.200-10");
        cliente.setRg("10.232.99-20");
        cliente.setCelular("(11)99898-7777");
        cliente.setEndereco(endereco);

        cliente.addContrato(contrato1);
        cliente.addContrato(contrato2);
        cliente.addContrato(contrato3);

        // Gerando arquivo do contrato
        try {
            GerarArquivoContrato.gerarContratoTxt(cliente);
            GerarArquivoContrato.gerarContratoCsv(cliente);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
