package sistemaAguaLuz.application;

import sistemaAguaLuz.model.CarregarArquivoContrato;
import sistemaAguaLuz.model.Contrato;

import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        try {
            ArrayList<Contrato> listaContratosTxt = CarregarArquivoContrato.carregarContratosTxt();
            ArrayList<Contrato> listaContratosCsv = CarregarArquivoContrato.carregarContratosCsv();

            for (Contrato x: listaContratosTxt) {
                System.out.println(x);
            }

            for (Contrato x: listaContratosCsv) {
                System.out.println(x);
            }
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }
}
