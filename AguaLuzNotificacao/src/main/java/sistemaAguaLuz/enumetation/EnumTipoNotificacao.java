package sistemaAguaLuz.enumetation;

public enum EnumTipoNotificacao {
    WHATSAPP('W'),
    SMS('S');

    private final char sigla;

    EnumTipoNotificacao(char sigla) {
        this.sigla = sigla;
    }

    public char getSigla() {
        return sigla;
    }

    public static EnumTipoNotificacao getNotificacao(String sigla) {
        if (sigla == "W")
            return EnumTipoNotificacao.WHATSAPP;
        return EnumTipoNotificacao.SMS;
    }
}
