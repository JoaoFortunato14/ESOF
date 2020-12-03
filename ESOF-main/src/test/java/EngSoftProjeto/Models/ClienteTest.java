package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void consultarCustoProjeto() {
        Cliente cl= new Cliente();
        cl.setNome("Joao");
        cl.setEmail("jp1234@gmail.com");


        Projeto p1= new Projeto();
        p1.setNome("Projeto A");
        cl.projetos.add(p1);
        Projeto p2= new Projeto();
        p2.setNome("Projeto B");
        cl.projetos.add(p2);


        assertTrue(cl.consultarCustoProjeto(p1));
        assertTrue(cl.consultarDuracaoProjeto(p1));
        assertTrue(cl.consultarCustoProjeto(p2));
        assertTrue(cl.consultarDuracaoProjeto(p2));
    }



}