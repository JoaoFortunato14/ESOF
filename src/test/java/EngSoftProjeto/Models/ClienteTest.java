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


    }

    @Test
    void consultarDuracaoProjeto() {
    }
}