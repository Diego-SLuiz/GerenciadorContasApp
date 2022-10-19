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
            //System.out.println(listaClientesTxt);
            //System.out.println(listaClientesCsv);

            for (Cliente x: listaClientesTxt) {
                System.out.println(x.exibirContratos());
            }
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }
}
