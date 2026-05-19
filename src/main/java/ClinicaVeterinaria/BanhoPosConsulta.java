package ClinicaVeterinaria;

public class BanhoPosConsulta
        extends AtendimentoDecorator {

    public BanhoPosConsulta(
            AtendimentoValor atendimentoValor) {

        super(atendimentoValor);
    }

    public double getValor() {
        return atendimentoValor.getValor() + 40.0;
    }

    public String getDescricao() {
        return atendimentoValor.getDescricao() +
                " + banho pós-consulta";
    }
}