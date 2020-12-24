package EngSoftProjeto.services;


import EngSoftProjeto.Models.Cargo;
import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Services.EmpregadoService;
import EngSoftProjeto.Services.UseCasesFacade.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = EmpregadoServiceFacade.class)
class EmpregadoServiceTest {

    @Autowired
    private EmpregadoService empregadoService;

    @MockBean
    private AdicionaTarefaUseCase adicionaTarefaUseCase;

    @MockBean
    private CriaEmpregadoUseCase criaEmpregadoUseCase;

    @MockBean
    private ListaEmpregadosPorIdUseCase listaEmpregadosPorIdUseCase;

    @MockBean
    private ListaEmpregadosUseCase listaEmpregadosUseCase;


    @Test
    void criarEmpregado(){

        Empregado empregado= new Empregado();
        empregado.setNome("Nuno");
        empregado.setCargo(Cargo.DesenvolvedorJr);

        Tarefa tarefa= new Tarefa();
        tarefa.setId((long)1);
        tarefa.setDuracao(120);

        empregado.addTarefa(tarefa);

        when(criaEmpregadoUseCase.createEmpregado(empregado)).thenReturn(Optional.of(empregado));

        assertTrue(empregadoService.criaEmpregado(empregado).isPresent());


    }

    @Test
    void adicionaTarefa(){

        Empregado empregado= new Empregado();
        empregado.setNome("Nuno");
        empregado.setCargo(Cargo.DesenvolvedorJr);

        Tarefa tarefa= new Tarefa();
        tarefa.setId((long)1);
        tarefa.setDuracao(120);


    }













}
