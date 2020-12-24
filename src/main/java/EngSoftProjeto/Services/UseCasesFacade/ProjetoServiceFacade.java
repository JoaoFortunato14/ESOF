package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Services.ProjetoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoServiceFacade implements ProjetoService {
    private final AdicionarTarefaProjetoUseCase adicionarTarefaProjetoUseCase;
    private final ListarProjetosPorIdUseCase listarProjetosPorIdUseCase;
    private final ListarTodosProjetosUseCase listarTodosProjetosUseCase;
    private final CriarProjetoUseCase criarProjetoUseCase;

    public ProjetoServiceFacade(AdicionarTarefaProjetoUseCase adicionarTarefaProjetoUseCase, ListarProjetosPorIdUseCase listarProjetosPorIdUseCase, ListarTodosProjetosUseCase listarTodosProjetosUseCase, CriarProjetoUseCase criarProjetoUseCase) {
        this.adicionarTarefaProjetoUseCase = adicionarTarefaProjetoUseCase;
        this.listarProjetosPorIdUseCase = listarProjetosPorIdUseCase;
        this.listarTodosProjetosUseCase = listarTodosProjetosUseCase;
        this.criarProjetoUseCase = criarProjetoUseCase;
    }

    @Override
    public Optional<Tarefa> adicionaTarefa(Long tarefaId, Projeto projeto) {
        return adicionarTarefaProjetoUseCase.adicionaTarefa(tarefaId,projeto);
    }

    @Override
    public Optional<Projeto> findById(Long id){
        return listarProjetosPorIdUseCase.findById(id);
    }

    @Override
    public List<Projeto> findAll(){
        return listarTodosProjetosUseCase.findAll();
    }


    @Override
    public  Optional<Projeto> criarProjeto(Projeto projeto){
        return criarProjetoUseCase.criarProjeto(projeto);
    }






}
