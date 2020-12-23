package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Services.EmpregadoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadoServiceFacade implements EmpregadoService {

    private final ListaEmpregadosUseCase listaEmpregadosUseCase;
    private final ListaEmpregadosPorIdUseCase listaEmpregadosPorIdUseCase;
    private final CriaEmpregadoUseCase criaEmpregadoUseCase;
    private final AdicionaTarefaUseCase adicionaTarefaUseCase;

    public EmpregadoServiceFacade(ListaEmpregadosUseCase listaEmpregadosUseCase, ListaEmpregadosPorIdUseCase listaEmpregadosPorIdUseCase, CriaEmpregadoUseCase criaEmpregadoUseCase, AdicionaTarefaUseCase adicionaTarefaUseCase) {
        this.listaEmpregadosUseCase = listaEmpregadosUseCase;
        this.listaEmpregadosPorIdUseCase = listaEmpregadosPorIdUseCase;
        this.criaEmpregadoUseCase = criaEmpregadoUseCase;
        this.adicionaTarefaUseCase = adicionaTarefaUseCase;
    }

    @Override
    public List<Empregado> listaEmpregados(){
        return listaEmpregadosUseCase.findAll();
    }

    @Override
    public Optional<Empregado> listaEmpregadosPorId(Long id){
        return listaEmpregadosPorIdUseCase.findById(id);
    }

    @Override
    public Optional<Empregado> criaEmpregado(Empregado converter){
        return criaEmpregadoUseCase.createEmpregado(converter);
    }

    @Override
    public  Optional<Empregado> adicionaTarefa(Long empregadoId, Tarefa tarefa){
        return adicionaTarefaUseCase.adicionaTarefa(empregadoId,tarefa);
    }
}
