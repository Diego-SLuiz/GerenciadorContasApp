package sistemaAguaLuz.enumetation;

public enum EnumTipoServico {
    AGUA(127.33),
    LUZ(132.15);

    private final Double valor;

    EnumTipoServico(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public static EnumTipoServico getServico(String sigla) {
        if (sigla == "A")
            return EnumTipoServico.AGUA;
        return EnumTipoServico.LUZ;
    }
}
