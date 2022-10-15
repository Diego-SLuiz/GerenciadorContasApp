package sistemaAguaLuz.model;

public class CarregarArquivoContrato {
    public static void  carregarContrato(Contrato contrato) {

        Contrato contrato1 = new Contrato();
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
        contrato.getHora();
        contrato.getProtocolo();
        contrato.getTipoNotificacao().getSigla();
        contrato.getTipoServico();
        contrato.getTipoServico().getValor();

        System.out.println(contrato);

    }
}
