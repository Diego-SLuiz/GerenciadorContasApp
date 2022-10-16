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

    public static EnumPais getPais(String sigla) {
        if (sigla == EnumPais.BRASIL.getSigla())
            return EnumPais.BRASIL;
        if (sigla == EnumPais.ESTADOSUNIDOS.getSigla())
            return EnumPais.ESTADOSUNIDOS;
        return EnumPais.FRANCA;
    }
}
