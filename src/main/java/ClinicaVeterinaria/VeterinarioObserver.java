package ClinicaVeterinaria;

public class VeterinarioObserver
        implements ObservadorAtendimento {

    private String ultimaNotificacao;

    public void atualizar(String mensagem) {
        this.ultimaNotificacao =
                "Veterinário avisado: " + mensagem;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}