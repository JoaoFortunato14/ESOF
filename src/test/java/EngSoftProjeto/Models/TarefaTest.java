package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test //Check
    void custoTarefa() {
        Tarefa tf= new Tarefa();
        tf.setId((long)1);
        tf.setDuracao(120);   //minutos

        Empregado emp= new Empregado();
        emp.setNome("Pedri");
        tf.setEmpregado(emp);   //atribuir EMP a tarefa

        Tarefa tf1= new Tarefa();
        tf1.setId((long)2);
        tf1.setDuracao(60);
        tf1.setEmpregado(emp);

        Tarefa tf2= new Tarefa();
        tf2.setId((long)3);
        tf2.setDuracao(180);
        tf2.setEmpregado(emp);

        assertEquals(20,tf.custoTarefa());
        assertEquals(20, tf1.custoTarefa());
        assertEquals(120,tf2.custoTarefa());
    }
}