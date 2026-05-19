package ClinicaVeterinaria;

public class TutorObserver
        implements ObservadorAtendimento {

    private String ultimaNotificacao;

    public void atualizar(String mensagem) {
        this.ultimaNotificacao =
                "Tutor avisado: " + mensagem;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}