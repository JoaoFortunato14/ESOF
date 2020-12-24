package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Services.ClienteService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceFacade implements ClienteService {

    private final AdicionaProjetoClienteUseCase adicionarProjetoUseCase;
    private final CriarClienteUseCase criarClienteUseCase;
    private final ListarClientePorIdUseCase listarClientePorIdUseCase;
    private final ListarTodosClienteUseCase listarTodosClienteUseCase;



    public ClienteServiceFacade(AdicionaProjetoClienteUseCase adicionarProjetoUseCase, CriarClienteUseCase criarClienteUseCase, ListarClientePorIdUseCase listarClientePorIdUseCase, ListarTodosClienteUseCase listarTodosClienteUseCase) {
        this.adicionarProjetoUseCase = adicionarProjetoUseCase;
        this.criarClienteUseCase = criarClienteUseCase;
        this.listarClientePorIdUseCase = listarClientePorIdUseCase;
        this.listarTodosClienteUseCase = listarTodosClienteUseCase;
    }

    @Override
    public Optional<Cliente> adicionaProjeto(Long clienteId, Projeto projeto) {
        return adicionarProjetoUseCase.adicionaProjeto(clienteId,projeto);
    }

    @Override
    public Optional<Cliente> CriarCliente(Cliente cliente) {
        return criarClienteUseCase.criarCliente(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return listarTodosClienteUseCase.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return listarClientePorIdUseCase.findById(id);
    }








}
