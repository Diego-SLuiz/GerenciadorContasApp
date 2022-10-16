package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumPais;
import sistemaAguaLuz.enumetation.EnumTipoNotificacao;
import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class CarregarArquivoContrato {

    public static ArrayList<Contrato> carregarContratosTxt() throws IOException {
        File diretorio = new File("..\\AguaLuzAtracao\\src\\main\\java\\agua-luz-output\\");
        FileReader arquivo = new FileReader(diretorio.getPath() + "\\agua-luz-contratos.txt");
        BufferedReader reader = new BufferedReader(arquivo);
        Contrato contrato = new Contrato();
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        ArrayList<Contrato> listaContratos = new ArrayList<Contrato>();
        String line;

        while ((line = reader.readLine()) != null) {
            cliente.setCpf(line.substring(0, 11).trim());
            cliente.setRg(line.substring(11, 21).trim());
            cliente.setNome(line.substring(21, 51).trim());
            cliente.setCelular(line.substring(51, 62).trim());

            endereco.setLogradouro(line.substring(62, 82).trim());
            endereco.setNumero(Integer.parseInt(line.substring(82, 88).trim()));
            endereco.setComplemento(line.substring(88, 98).trim());
            endereco.setBairro(line.substring(98, 113).trim());
            endereco.setCidade(line.substring(113, 143).trim());
            endereco.setUf(line.substring(143, 145).trim());
            endereco.setCep(line.substring(145, 153).trim());
            endereco.setPais(EnumPais.getPais(line.substring(153, 155).trim()));

            contrato.setProtocolo(line.substring(155, 165).trim());
            contrato.setData(LocalDate.of(Integer.parseInt(line.substring(165, 169)), Integer.parseInt(line.substring(169, 171)), Integer.parseInt(line.substring(171, 173))));
            contrato.setHora(LocalTime.of(Integer.parseInt(line.substring(173, 175)), Integer.parseInt(line.substring(175, 177))));
            contrato.setTipoServico(EnumTipoServico.getServico(line.substring(177, 179)));
            contrato.setTipoNotificacao(EnumTipoNotificacao.getNotificacao(line.substring(186, 187).trim()));

            cliente.setEndereco(endereco);
            contrato.setCliente(cliente);
            listaContratos.add(contrato);
        }

        return listaContratos;
    }

    public static ArrayList<Contrato> carregarContratosCsv() throws IOException {
        File diretorio = new File("..\\AguaLuzAtracao\\src\\main\\java\\agua-luz-output\\");
        FileReader arquivo = new FileReader(diretorio.getPath() + "\\agua-luz-contratos.csv");
        BufferedReader reader = new BufferedReader(arquivo);
        Contrato contrato = new Contrato();
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        ArrayList<Contrato> listaContratos = new ArrayList<Contrato>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] atributos = line.split(";");

            cliente.setCpf(atributos[0]);
            cliente.setRg(atributos[1]);
            cliente.setNome(atributos[2]);
            cliente.setCelular(atributos[3]);

            endereco.setLogradouro(atributos[4]);
            endereco.setNumero(Integer.parseInt(atributos[5]));
            endereco.setComplemento(atributos[6]);
            endereco.setBairro(atributos[7]);
            endereco.setCidade(atributos[8]);
            endereco.setUf(atributos[9]);
            endereco.setCep(atributos[10]);
            endereco.setPais(EnumPais.valueOf(atributos[11]));

            contrato.setProtocolo(atributos[12]);
            contrato.setData(LocalDate.parse(atributos[13]));
            contrato.setHora(LocalTime.parse(atributos[14]));
            contrato.setTipoServico(EnumTipoServico.valueOf(atributos[15]));
            contrato.setTipoNotificacao(EnumTipoNotificacao.valueOf(atributos[17]));

            cliente.setEndereco(endereco);
            contrato.setCliente(cliente);

            listaContratos.add(contrato);
        }

        return listaContratos;
    }
}
