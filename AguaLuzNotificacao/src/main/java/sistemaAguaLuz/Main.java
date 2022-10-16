package sistemaAguaLuz;

import sistemaAguaLuz.model.GerarArquivoContrato;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            GerarArquivoContrato.gerarContrato(null);
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }
}
