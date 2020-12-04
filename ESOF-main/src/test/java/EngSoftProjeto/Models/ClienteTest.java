package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void consultarCustoProjeto() {
        Cliente cl= new Cliente();
        cl.setNome("Joao");
        cl.setEmail("jp1234@gmail.com");

        Empregado emp=new Empregado();
        emp.setNome("Analistajunior");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(10);


        Tarefa t=new Tarefa();
        t.setDuracao(20);
        t.setEmpregado(emp);
        long aux=12;
        t.setId(aux);


        Projeto p1= new Projeto();
        p1.setNome("Projeto A");
        cl.projetos.add(p1);
        p1.tarefas.add(t);

        Projeto p2= new Projeto();
        p2.setNome("Projeto B");
        cl.projetos.add(p2);
        p2.tarefas.add(t);


        assertEquals(1,cl.consultarCustoProjeto(p1));  // usar o equals para testar

        assertEquals(20,cl.consultarDuracaoProjeto(p1));

        assertEquals(1,cl.consultarCustoProjeto(p2));
        assertEquals(20,cl.consultarDuracaoProjeto(p2));
    }



}