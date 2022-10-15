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

}
