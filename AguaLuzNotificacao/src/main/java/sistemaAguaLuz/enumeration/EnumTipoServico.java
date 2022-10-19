package sistemaAguaLuz.enumeration;

public enum EnumTipoServico {
    AGUA(127.33, "A"),
    LUZ(132.15, "L");

    private final Double valor;
    private final String sigla;

    EnumTipoServico(Double valor, String sigla) {
        this.valor = valor;
        this.sigla = sigla;
    }

    public Double getValor() {
        return valor;
    }

    public String getSigla() {
        return sigla;
    }

    public static EnumTipoServico getServico(String sigla) {
        for(EnumTipoServico ts : values()){
            if(ts.getSigla().equals(sigla))
                return ts;
        }
        throw new IllegalArgumentException("Nao foi possivel localizar um tipo serviço com a sigla " + sigla);
    }
}
