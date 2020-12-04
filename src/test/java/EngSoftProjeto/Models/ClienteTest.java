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

        Empregado emp1=new Empregado();
        emp1.setNome("Analistajunior");
        emp1.setCargo(Cargo.AnalistaJr);
        emp1.setHoraValor(20);


        Tarefa t=new Tarefa();
        t.setDuracao(60);
        t.setEmpregado(emp1);
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


        assertEquals(10,cl.consultarCustoProjeto(p1));  // usar o equals para testar

    }

    @Test
    void consultarDuracaoProjeto() {

        Cliente cl= new Cliente();
        cl.setNome("Brubru");
        cl.setEmail("bruno99@gmail.com");

        Empregado emp= new Empregado();
        emp.setNome("Joao");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(emp.custo(emp.getCargo()));

        Tarefa t= new Tarefa();
        t.setDuracao(120);
        t.setEmpregado(emp);
        t.setId((long)2);

        Tarefa t1= new Tarefa();
        t1.setDuracao(60);
        t1.setEmpregado(emp);
        t1.setId((long)3);

        Projeto p1= new Projeto();
        p1.setNome("Projeto A");
        cl.projetos.add(p1);
        p1.tarefas.add(t);
        p1.tarefas.add(t1);

        assertEquals(180, cl.consultarDuracaoProjeto(p1));

    }
}