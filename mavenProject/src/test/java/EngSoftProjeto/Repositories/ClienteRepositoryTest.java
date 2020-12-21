package EngSoftProjeto.Repositories;

import EngSoftProjeto.Models.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClienteRepositoryTest {

    @Autowired  //instaciar a variavel, não é necessário fazer new ClienteRep
    private ClienteRepository clienteRepository;

    //TESTE adiciaonar cliente a BD
    @Test
    public void testCriarCliente(){





        Cliente cl= new Cliente();
        cl.setEmail("abcd@hohoh.com");
        cl.setNome("Joao B");


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
        cl.addProjeto(p1);
        p1.addTarefa(t);


/*
        Cliente cl2= new Cliente();
        cl2.setEmail("aaaaaaa@hohoh.com");
        cl2.setNome("Joao D");
*/
        assertEquals(0, clienteRepository.count());

        //adicionar a BD
        clienteRepository.save(cl);
  //      clienteRepository.save(cl2);
        //verificar se adicionou à BD(adicionamos 1 cliente logo expected=1)
        assertEquals(1, clienteRepository.count());
    }

}