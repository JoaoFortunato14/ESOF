package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    void custoTarefa() {
        Tarefa tf= new Tarefa();
        tf.setId((long)1);
        tf.setDuracao(2);

        Empregado emp= new Empregado();
        emp.setNome("Pedri");
        emp.custo(Cargo.DesenvolvedorJr);

        tf.setEmpregado(emp);
        int duracao=120;
        tf.custoTarefa(duracao);

        assertTrue(tf.custoTarefa(tf.getDuracao()));

    }
}