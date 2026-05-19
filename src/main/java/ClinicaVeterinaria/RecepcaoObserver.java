package ClinicaVeterinaria;

public class RecepcaoObserver
        implements ObservadorAtendimento {

    private String ultimaNotificacao;

    public void atualizar(String mensagem) {
        this.ultimaNotificacao =
                "Recepção avisada: " + mensagem;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}