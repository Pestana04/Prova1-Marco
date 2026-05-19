package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private Tutor tutor;
    private Animal animal;
    private ServicoVeterinario servicoVeterinario;

    private AtendimentoEstado estado;

    private List<ObservadorAtendimento>
            observadores = new ArrayList<>();

    public Atendimento(
            Tutor tutor,
            Animal animal,
            ServicoVeterinario servicoVeterinario) {

        this.tutor = tutor;
        this.animal = animal;
        this.servicoVeterinario = servicoVeterinario;

        this.estado =
                AtendimentoEstadoAgendado.getInstance();
    }

    public void adicionarObservador(
            ObservadorAtendimento observador) {

        this.observadores.add(observador);
    }

    public void notificarObservadores(
            String mensagem) {

        for (ObservadorAtendimento observador :
                observadores) {

            observador.atualizar(mensagem);
        }
    }

    public void setEstado(
            AtendimentoEstado estado) {

        this.estado = estado;

        notificarObservadores(
                "Atendimento alterado para "
                        + estado.getEstado()
        );
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public ServicoVeterinario
    getServicoVeterinario() {

        return servicoVeterinario;
    }
}