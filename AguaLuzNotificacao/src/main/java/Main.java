import sistemaAguaLuz.enumetation.EnumPais;
import sistemaAguaLuz.enumetation.EnumTipoNotificacao;
import sistemaAguaLuz.enumetation.EnumTipoServico;
import sistemaAguaLuz.model.CarregarArquivoContrato;
import sistemaAguaLuz.model.Cliente;
import sistemaAguaLuz.model.Contrato;
import sistemaAguaLuz.model.Endereco;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
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

        // Criando objeto cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo diCaprio da Silva");
        cliente.setCpf("400.300.200-10");
        cliente.setRg("10.232.99-20");
        cliente.setCelular("(11)99898-7777");
        cliente.setEndereco(endereco);

        // Criando objeto contrato
        Contrato contrato = new Contrato();
        contrato.setCliente(cliente);
        contrato.setData(LocalDate.now().plusDays(10));
        contrato.setHora(LocalTime.now());
        contrato.setTipoServico(EnumTipoServico.AGUA);
        contrato.setTipoNotificacao(EnumTipoNotificacao.SMS);

        // Gerando arquivo do contrato
        try {
            CarregarArquivoContrato.gerarContratoTxt(contrato);
            CarregarArquivoContrato.gerarContratoCsv(contrato);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
