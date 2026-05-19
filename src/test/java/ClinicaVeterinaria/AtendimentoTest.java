package ClinicaVeterinaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtendimentoTest {

    @Test
    void deveMudarDeAgendadoParaEmAtendimento() {

        Tutor tutor =
                new Tutor("Gustavo",
                        "99999-9999");

        Animal animal =
                new Animal(
                        "Rex",
                        "Cachorro",
                        false
                );

        ServicoVeterinario servico =
                new ServicoVeterinario(
                        "Consulta",
                        100.0
                );

        Atendimento atendimento =
                new Atendimento(
                        tutor,
                        animal,
                        servico
                );

        assertTrue(atendimento.iniciar());

        assertEquals(
                "Em Atendimento",
                atendimento.getNomeEstado()
        );
    }

    @Test
    void naoDeveCancelarAtendimentoFinalizado() {

        Tutor tutor =
                new Tutor("Gustavo",
                        "99999-9999");

        Animal animal =
                new Animal(
                        "Rex",
                        "Cachorro",
                        false
                );

        ServicoVeterinario servico =
                new ServicoVeterinario(
                        "Consulta",
                        100.0
                );

        Atendimento atendimento =
                new Atendimento(
                        tutor,
                        animal,
                        servico
                );

        atendimento.iniciar();
        atendimento.finalizar();

        assertFalse(atendimento.cancelar());

        assertEquals(
                "Finalizado",
                atendimento.getNomeEstado()
        );
    }

    @Test
    void deveEnviarAvisoAutomatico() {

        Tutor tutor =
                new Tutor("Gustavo",
                        "99999-9999");

        Animal animal =
                new Animal(
                        "Rex",
                        "Cachorro",
                        false
                );

        ServicoVeterinario servico =
                new ServicoVeterinario(
                        "Consulta",
                        100.0
                );

        Atendimento atendimento =
                new Atendimento(
                        tutor,
                        animal,
                        servico
                );

        TutorObserver tutorObserver =
                new TutorObserver();

        atendimento.adicionarObservador(
                tutorObserver
        );

        atendimento.iniciar();

        assertEquals(
                "Tutor avisado: Atendimento alterado para Em Atendimento",
                tutorObserver.getUltimaNotificacao()
        );
    }

    @Test
    void deveCalcularValorFinalComMaisDeUmaRegra() {

        AtendimentoValor valor =
                new AtendimentoBase(
                        100.0,
                        "Consulta veterinária"
                );

        valor = new DescontoAnimalAdotado(valor);

        valor = new TaxaAtendimentoDomiciliar(valor);

        valor = new BanhoPosConsulta(valor);

        assertEquals(
                170.0,
                valor.getValor(),
                0.01
        );

        assertEquals(
                "Consulta veterinária + desconto animal adotado + taxa atendimento domiciliar + banho pós-consulta",
                valor.getDescricao()
        );
    }
}