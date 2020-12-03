package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    @Test
    void custoProjeto() {
        Cliente cl= new Cliente();
        cl.setNome("Joao");
        cl.setEmail("jp1234@gmail.com");

        Projeto p1= new Projeto();
        p1.setNome("Projeto A");
        p1.setCliente(cl);


        Empregado emp=new Empregado();
        emp.setNome("Analistajunior");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(10);

        Tarefa t=new Tarefa();
        t.setDuracao(20);
        t.setEmpregado(emp);
        long aux=12;
        t.setId(aux);

        p1.tarefas.add(t);

        assertTrue(p1.custoProjeto());




    }

    @Test
    void duracao() {
        Cliente cl= new Cliente();
        cl.setNome("Joao");
        cl.setEmail("jp1234@gmail.com");

        Projeto p1= new Projeto();
        p1.setNome("Projeto A");
        p1.setCliente(cl);


        Empregado emp=new Empregado();
        emp.setNome("Analistajunior");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(10);

        Tarefa t=new Tarefa();
        t.setDuracao(20);
        t.setEmpregado(emp);
        long aux=12;
        t.setId(aux);

        p1.tarefas.add(t);


        assertTrue(p1.duracao());
    }
}