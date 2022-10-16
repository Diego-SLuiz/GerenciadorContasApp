package sistemaAguaLuz.enumetation;

public enum EnumPais {
    BRASIL("BR"),
    ESTADOSUNIDOS("US"),
    FRANCA("FR");

    private final String sigla;

    EnumPais(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
