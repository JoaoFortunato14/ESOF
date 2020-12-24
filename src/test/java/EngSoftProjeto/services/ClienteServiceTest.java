package EngSoftProjeto.services;


import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Services.ClienteService;
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

@SpringBootTest(classes = ClienteServiceFacade.class)
class ClienteServiceTest {

    @Autowired
    private ClienteService clienteService;

    @MockBean
    private AdicionaProjetoClienteUseCase adicionaProjetoClienteUseCase;

    @MockBean
    private CriarClienteUseCase criarClienteUseCase;

    @Test
    void findAll(){
        when(ListarTodosClienteUseCase.findAll()).thenReturn(new ArrayList<>());
        assertNotNull(clienteService.findAll());
    }

    @Test
    void findById(){
        when(ListarClientePorIdUseCase.findById(1L)).thenReturn(Optional.of(new Cliente()));
        assertTrue(clienteService.findById(1L).isPresent());
        assertTrue(clienteService.findById(2L).isEmpty());
    }


    @Test
    void criarCliente(){
        String email="pedroasd@miejkm.com";
        String nome="Pedro";
        String projetoNome="ESOF";

        Cliente cliente= new Cliente();
        cliente.setEmail("email");
        cliente.setNome("nome");

        Projeto projeto = new Projeto();
        projeto.setNome(projetoNome);
        projeto.setCliente(cliente);

        cliente.addProjeto(projeto);

        when(criarClienteUseCase.criarCliente(cliente)).thenReturn(Optional.of(cliente));

        assertTrue(clienteService.CriarCliente(cliente).isPresent());

    }

    @Test
    void adicionaProjeto(){

        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        cliente.setEmail("email");

        Projeto projeto = new Projeto();
        projeto.setNome("ESOFproject");
        projeto.setCliente(cliente);
    }











}
