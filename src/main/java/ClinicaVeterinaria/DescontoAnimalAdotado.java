package ClinicaVeterinaria;

public class DescontoAnimalAdotado
        extends AtendimentoDecorator {

    public DescontoAnimalAdotado(
            AtendimentoValor atendimentoValor) {

        super(atendimentoValor);
    }

    public double getValor() {
        return atendimentoValor.getValor() - 20.0;
    }

    public String getDescricao() {
        return atendimentoValor.getDescricao() +
                " + desconto animal adotado";
    }
}