package ClinicaVeterinaria;

public class AtendimentoEstadoFinalizado
        extends AtendimentoEstado {

    private static AtendimentoEstadoFinalizado instance =
            new AtendimentoEstadoFinalizado();

    private AtendimentoEstadoFinalizado() {}

    public static AtendimentoEstadoFinalizado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizado";
    }
}