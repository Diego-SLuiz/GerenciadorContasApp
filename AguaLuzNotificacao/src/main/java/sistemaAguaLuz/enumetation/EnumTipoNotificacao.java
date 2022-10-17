package sistemaAguaLuz.enumetation;

public enum EnumTipoNotificacao {
    WHATSAPP("W"),
    SMS("S");

    private final String sigla;

    EnumTipoNotificacao(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public static EnumTipoNotificacao getNotificacao(String sigla) {
        for(EnumTipoNotificacao tn : values()){
            if(tn.getSigla().equals(sigla))
                return tn;
        }
        throw new IllegalArgumentException("Nao foi possivel localizar um tipo notificacao com a sigla " + sigla);
    }
}
