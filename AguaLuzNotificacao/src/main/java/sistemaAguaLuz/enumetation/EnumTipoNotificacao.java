package sistemaAguaLuz.enumetation;

public enum EnumTipoNotificacao {
    WHATSAPP('W'),
    SMS('S');
    final char sigla;

    EnumTipoNotificacao(char sigla) {
        this.sigla = sigla;
    }

}
