package sistemaAguaLuz.model;

import sistemaAguaLuz.enumetation.EnumTipoNotificacao;
import sistemaAguaLuz.enumetation.EnumTipoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {
    private Cliente cliente;
    private String protocolo;
    private LocalDate data;
    private LocalTime hora;
    private EnumTipoServico tipoServico;
    private Double valor;
    private EnumTipoNotificacao tipoNotificacao;

    public Contrato(Cliente cliente, String protocolo, EnumTipoServico tipoServico, Double valor, EnumTipoNotificacao tipoNotificacao) {
        this.cliente = cliente;
        this.protocolo = protocolo;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.tipoNotificacao = tipoNotificacao;
    }

}
