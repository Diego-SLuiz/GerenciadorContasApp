package sistemaAguaLuz.application;

import sistemaAguaLuz.model.CarregarArquivoContrato;
import sistemaAguaLuz.model.Cliente;
import sistemaAguaLuz.model.Contrato;

import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        try {
            ArrayList<Cliente> listaClientesTxt = CarregarArquivoContrato.carregarContratosTxt();
            ArrayList<Cliente> listaClientesCsv = CarregarArquivoContrato.carregarContratosCsv();

            for (Cliente x: listaClientesCsv) {
                System.out.println(x.exibirContrato());
            }
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }
}
