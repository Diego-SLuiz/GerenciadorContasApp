package sistemaAguaLuz.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivoContrato {
    public static void gerarContrato(Contrato contrato) throws IOException {
        // Criar diretórios necessários
        File diretorio = new File(".\\src\\main\\java\\sistemaAguaLuz\\agua-luz-output\\");

        if (!diretorio.exists()){
            diretorio.mkdirs();
        }

        // Teste escrita de arquivos
        FileWriter arquivo = new FileWriter(diretorio.getPath() + "\\teste.txt", true);
        BufferedWriter writer = new BufferedWriter(arquivo);

        writer.write("");
        writer.newLine();
        writer.close();
    }
}
