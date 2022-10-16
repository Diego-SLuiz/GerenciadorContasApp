package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivoContrato {
    public static void gerarContratoTxt(Contrato contrato) throws IOException {
        //CLIENTE
        String nome = String.format("%30.30s", contrato.getCliente().getNome());
        String cpf = String.format("%s", contrato.getCliente().getCpf().replaceAll("\\D", ""));
        String rg = String.format("%10.10s", contrato.getCliente().getRg().replaceAll("\\D", ""));
        String celular = contrato.getCliente().getCelular().replaceAll("\\D", "");

        //ENDEREÇO
        String logradouro = String.format("%20.20s", contrato.getCliente().getEndereco().getLogradouro());
        String numeroEndereco = String.format("%06d", contrato.getCliente().getEndereco().getNumero());
        String bairro = String.format("%15.15s", contrato.getCliente().getEndereco().getBairro());
        String complemento = String.format("%10.10s", contrato.getCliente().getEndereco().getComplemento());
        String cidade = String.format("%30.30s", contrato.getCliente().getEndereco().getCidade());
        String cep = String.format("%08d", Integer.parseInt(contrato.getCliente().getEndereco().getCep().replaceAll("\\D", "")));
        String uf = contrato.getCliente().getEndereco().getUf();
        String pais = contrato.getCliente().getEndereco().getEnumPais().getSigla();

        String data = contrato.getData().toString().replaceAll("\\D", "");
        String hora = String.format("%02d", contrato.getHora().getHour()) + String.format("%02d", contrato.getHora().getMinute());
        String protocolo = contrato.getProtocolo();
        char tipoNofiticacao = contrato.getTipoNotificacao().getSigla();
        String tipoServico = contrato.getTipoServico() == EnumTipoServico.AGUA ? "A" : "L";
        String valorServico = String.format("%08d", Integer.parseInt(contrato.getTipoServico().getValor().toString().replaceAll("\\D", "")));

        //BUILDER
        StringBuilder resultado = new StringBuilder();
        resultado.append(cpf);
        resultado.append(rg);
        resultado.append(nome);
        resultado.append(celular);

        resultado.append(logradouro);
        resultado.append(numeroEndereco);
        resultado.append(complemento);
        resultado.append(bairro);
        resultado.append(cidade);
        resultado.append(uf);
        resultado.append(cep);
        resultado.append(pais);

        resultado.append(protocolo);
        resultado.append(data);
        resultado.append(hora);
        resultado.append(tipoServico);
        resultado.append(valorServico);
        resultado.append(tipoNofiticacao);

        File directory = new File(".\\src\\main\\java\\agua-luz-output");

        if (!directory.exists()) {
            directory.mkdir();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(directory.toPath() + "\\agua-luz-contratos.txt", true));
        writer.write(resultado.toString());
        writer.newLine();
        writer.close();

        System.out.println("Arquivo agua-luz-contratos.txt gerado com sucesso!");
    }

    public static void gerarContratoCsv(Contrato contrato) throws IOException {
        //BUILDER
        StringBuilder resultado = new StringBuilder();

        //CLIENTE
        resultado.append(contrato.getCliente().getCpf() + ";");
        resultado.append(contrato.getCliente().getRg() + ";");
        resultado.append(contrato.getCliente().getNome() + ";");
        resultado.append(contrato.getCliente().getCelular() + ";");

        //ENDEREÇO
        resultado.append(contrato.getCliente().getEndereco().getLogradouro() + ";");
        resultado.append(contrato.getCliente().getEndereco().getNumero() + ";");
        resultado.append(contrato.getCliente().getEndereco().getComplemento() + ";");
        resultado.append(contrato.getCliente().getEndereco().getBairro() + ";");
        resultado.append(contrato.getCliente().getEndereco().getCidade() + ";");
        resultado.append(contrato.getCliente().getEndereco().getUf() + ";");
        resultado.append(contrato.getCliente().getEndereco().getCep() + ";");
        resultado.append(contrato.getCliente().getEndereco().getEnumPais() + ";");

        //CONTRATO
        resultado.append(contrato.getProtocolo() + ";");
        resultado.append(contrato.getData() + ";");
        resultado.append(String.format("%02d", contrato.getHora().getHour()) + ":" + (String.format("%02d", contrato.getHora().getMinute()) + ";"));
        resultado.append(contrato.getTipoServico() + ";");
        resultado.append(contrato.getTipoServico().getValor() + ";");
        resultado.append(contrato.getTipoNotificacao());

        File directory = new File(".\\src\\main\\java\\agua-luz-output");

        if (!directory.exists()) {
            directory.mkdir();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(directory.toPath() + "\\agua-luz-contratos.csv", true));
        writer.write(resultado.toString());
        writer.newLine();
        writer.close();

        System.out.println("Arquivo agua-luz-contratos.csv gerado com sucesso!");
    }
}
