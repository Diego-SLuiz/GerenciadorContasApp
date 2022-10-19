package sistemaAguaLuz.enumeration;

public enum EnumPais {
    BRASIL("BR"),
    ESTADOSUNIDOS("US"),
    FRANCA("FR");

    private String sigla;

    EnumPais(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
