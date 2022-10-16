package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumTipoNotificacao;
import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Contrato {
    private Cliente cliente;
    private String protocolo;
    private LocalDate data;
    private LocalTime hora;
    private EnumTipoServico tipoServico;

    private EnumTipoNotificacao tipoNotificacao;

    public Contrato () {
        gerarProtocolo();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setTipoServico(EnumTipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }


    public void setTipoNotificacao(EnumTipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public EnumTipoServico getTipoServico() {
        return tipoServico;
    }


    public EnumTipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void gerarProtocolo() {
        Random random = new Random();
        this.protocolo = String.format("%s", random.nextInt(999999999));
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "cliente=" + cliente +
                ", protocolo='" + protocolo + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", tipoNotificacao=" + tipoNotificacao +
                  "Valor do serviço" + tipoServico.getValor() +
                '}';
    }
}
