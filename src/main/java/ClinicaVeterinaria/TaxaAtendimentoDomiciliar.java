package ClinicaVeterinaria;

public class TaxaAtendimentoDomiciliar
        extends AtendimentoDecorator {

    public TaxaAtendimentoDomiciliar(
            AtendimentoValor atendimentoValor) {

        super(atendimentoValor);
    }

    public double getValor() {
        return atendimentoValor.getValor() + 50.0;
    }

    public String getDescricao() {
        return atendimentoValor.getDescricao() +
                " + taxa atendimento domiciliar";
    }
}