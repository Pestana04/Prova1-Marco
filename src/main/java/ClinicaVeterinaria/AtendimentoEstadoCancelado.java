package ClinicaVeterinaria;

public class AtendimentoEstadoCancelado
        extends AtendimentoEstado {

    private static AtendimentoEstadoCancelado instance =
            new AtendimentoEstadoCancelado();

    private AtendimentoEstadoCancelado() {}

    public static AtendimentoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}