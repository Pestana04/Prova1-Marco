package ClinicaVeterinaria;

public class AtendimentoBase
        implements AtendimentoValor {

    private double valorBase;
    private String descricao;

    public AtendimentoBase(double valorBase,
                           String descricao) {
        this.valorBase = valorBase;
        this.descricao = descricao;
    }

    public double getValor() {
        return valorBase;
    }

    public String getDescricao() {
        return descricao;
    }
}