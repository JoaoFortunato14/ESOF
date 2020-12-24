package EngSoftProjeto.services;


import EngSoftProjeto.Models.*;
import EngSoftProjeto.Services.ProjetoService;
import EngSoftProjeto.Services.UseCasesFacade.*;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = ProjetoServiceFacade.class)
class ProjetoServiceTest {

    @Autowired
    private ProjetoService projetoService;

    @MockBean
    private AdicionarTarefaProjetoUseCase adicionarTarefaProjetoUseCase;

    @MockBean
    private CriarProjetoUseCase criarProjetoUseCase;

    @Test
    void findAll(){
        when(ListarTodosProjetosUseCase.findAll()).thenReturn(new ArrayList<>());
        assertNotNull(projetoService.findAll());
    }

    @Test
    void findById(){
        when(ListarProjetosPorIdUseCase.findById(1L)).thenReturn(Optional.of(new Projeto()));
        assertTrue(projetoService.findById(1L).isPresent());
        assertTrue(projetoService.findById(2L).isEmpty());
    }


    @Test
    void criarProjeto(){

        Cliente cliente= new Cliente();
        cliente.setNome("Pedro");
        cliente.setEmail("jp1234@gmail.com");

        Projeto projeto= new Projeto();
        projeto.setNome("Projeto A");
        projeto.setCliente(cliente);
        projeto.setId(1L);

        projeto.setCliente(cliente);

        when(criarProjetoUseCase.criarProjeto(projeto)).thenReturn(Optional.of(projeto));

        assertTrue(projetoService.criarProjeto(projeto).isPresent());


    }

    @Test
    void adicionaTarefa(){

        Cliente cliente= new Cliente();
        cliente.setNome("Pedro");
        cliente.setEmail("jp1234@gmail.com");

        Projeto projeto= new Projeto();
        projeto.setNome("Projeto A");
        projeto.setCliente(cliente);
        projeto.setId(1L);

        Empregado empregado=new Empregado();
        empregado.setNome("Analistajunior");
        empregado.setCargo(Cargo.DesenvolvedorJr);
        empregado.setHoraValor(10);

        Tarefa tarefa=new Tarefa();
        tarefa.setDuracao(120);
        tarefa.setEmpregado(empregado);
        long aux=12;
        tarefa.setId(aux);

        //Duvidas dos Asserts
    }


}
