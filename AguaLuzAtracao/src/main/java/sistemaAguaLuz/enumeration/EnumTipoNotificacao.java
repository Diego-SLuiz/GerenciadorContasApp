package sistemaAguaLuz.enumeration;

public enum EnumTipoNotificacao {
    WHATSAPP('W'),
    SMS('S');
    final char sigla;

    EnumTipoNotificacao(char sigla) {
        this.sigla = sigla;
    }

    public char getSigla() {
        return sigla;
    }
}
