package ClinicaVeterinaria;

public abstract class AtendimentoDecorator
        implements AtendimentoValor {

    protected AtendimentoValor atendimentoValor;

    public AtendimentoDecorator(
            AtendimentoValor atendimentoValor) {

        this.atendimentoValor = atendimentoValor;
    }

    public double getValor() {
        return atendimentoValor.getValor();
    }

    public String getDescricao() {
        return atendimentoValor.getDescricao();
    }
}