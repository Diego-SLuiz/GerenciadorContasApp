package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class GerarArquivoContrato {
    public static void gerarContratoTxt(Cliente cliente) throws IOException {

        for (Contrato contrato : cliente.getListaContratos()) {
            //BUILDER
            StringBuilder resultado = new StringBuilder();

            //CLIENTE
            resultado.append(String.format("%s", cliente.getCpf().replaceAll("\\D", "")));
            resultado.append(String.format("%10.10s", cliente.getRg().replaceAll("\\D", "")));
            resultado.append(String.format("%30.30s", cliente.getNome()));
            resultado.append(cliente.getCelular().replaceAll("\\D", ""));

            //ENDEREÇO
            resultado.append(String.format("%20.20s", cliente.getEndereco().getLogradouro()));
            resultado.append(String.format("%06d", cliente.getEndereco().getNumero()));
            resultado.append(String.format("%10.10s", cliente.getEndereco().getComplemento()));
            resultado.append(String.format("%15.15s", cliente.getEndereco().getBairro()));
            resultado.append(String.format("%30.30s", cliente.getEndereco().getCidade()));
            resultado.append(cliente.getEndereco().getUf());
            resultado.append(String.format("%08d", Integer.parseInt(cliente.getEndereco().getCep().replaceAll("\\D", ""))));
            resultado.append(cliente.getEndereco().getEnumPais().getSigla());

            //CONTRATOS
            resultado.append(contrato.getProtocolo());
            resultado.append(contrato.getData().toString().replaceAll("\\D", ""));
            resultado.append(contrato.getHora().format(DateTimeFormatter.ofPattern("HHmm")));
            resultado.append(contrato.getTipoServico() == EnumTipoServico.AGUA ? "A" : "L");
            resultado.append(String.format("%08d", Integer.parseInt(contrato.getTipoServico().getValor().toString().replaceAll("\\D", ""))));
            resultado.append(contrato.getTipoNotificacao().getSigla());

            File directory = new File(".\\src\\main\\java\\agua-luz-output");

            if (!directory.exists()) {
                directory.mkdir();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(directory.toPath() + "\\agua-luz-contratos.txt", true));
            writer.write(resultado.toString());
            writer.newLine();
            writer.close();
        }
        System.out.println("Arquivo agua-luz-clientes.txt gerado com sucesso!");
    }

    public static void gerarContratoCsv(Cliente cliente) throws IOException {
        for (Contrato contrato : cliente.getListaContratos()) {
            //BUILDER
            StringBuilder resultado = new StringBuilder();

            //CLIENTE
            resultado.append(cliente.getCpf() + ";");
            resultado.append(cliente.getRg() + ";");
            resultado.append(cliente.getNome() + ";");
            resultado.append(cliente.getCelular() + ";");

            //ENDEREÇO
            resultado.append(cliente.getEndereco().getLogradouro() + ";");
            resultado.append(cliente.getEndereco().getNumero() + ";");
            resultado.append(cliente.getEndereco().getComplemento() + ";");
            resultado.append(cliente.getEndereco().getBairro() + ";");
            resultado.append(cliente.getEndereco().getCidade() + ";");
            resultado.append(cliente.getEndereco().getUf() + ";");
            resultado.append(cliente.getEndereco().getCep() + ";");
            resultado.append(cliente.getEndereco().getEnumPais() + ";");

            //CONTRATO
            resultado.append(contrato.getProtocolo() + ";");
            resultado.append(contrato.getData() + ";");
            resultado.append(contrato.getHora().format(DateTimeFormatter.ofPattern("HH:mm")) + ";");
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
        }
        System.out.println("Arquivo agua-luz-clientes.csv gerado com sucesso!");
    }
}
