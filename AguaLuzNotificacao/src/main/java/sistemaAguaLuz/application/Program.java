package sistemaAguaLuz.application;

import sistemaAguaLuz.model.CarregarArquivoContrato;
import sistemaAguaLuz.model.Cliente;

import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        try {
            ArrayList<Cliente> listaContratosTxt = CarregarArquivoContrato.carregarContratosTxt();
            ArrayList<Cliente> listaContratosCsv = CarregarArquivoContrato.carregarContratosCsv();

            System.out.println(listaContratosCsv.get(0).exibirContrato());
            //for (Cliente x: listaContratosTxt) {
            //    System.out.println(x);
            //}

            //for (Cliente x: listaContratosCsv) {
            //    System.out.println(x);
            //}
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }
}
