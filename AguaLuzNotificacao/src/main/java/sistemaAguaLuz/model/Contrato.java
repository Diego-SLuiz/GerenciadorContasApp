package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumTipoNotificacao;
import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {
    private String protocolo;
    private LocalDate data;
    private LocalTime hora;
    private EnumTipoServico tipoServico;
    private EnumTipoNotificacao tipoNotificacao;

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public EnumTipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(EnumTipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public EnumTipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(EnumTipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "protocolo='" + protocolo + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", tipoNotificacao=" + tipoNotificacao +
                '}';
    }
}
