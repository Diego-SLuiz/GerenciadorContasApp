package sistemaAguaLuz.enumeration;

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
        for(EnumPais ep : values()){
            if(ep.getSigla().equals(sigla))
                return ep;
        }
        throw new IllegalArgumentException("Nao foi possivel localizar um tipo serviço com a sigla " + sigla);
    }
}
