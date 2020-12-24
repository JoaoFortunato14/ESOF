package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Repositories.ProjetoRepository;
import EngSoftProjeto.Repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdicionarTarefaProjetoUseCase {
    private final ProjetoRepository projetoRespository;
    private final TarefaRepository tarefaRepository;

    public AdicionarTarefaProjetoUseCase(ProjetoRepository projetoRespository, TarefaRepository tarefaRepository) {
        this.projetoRespository = projetoRespository;
        this.tarefaRepository = tarefaRepository;
    }

    public Optional<Tarefa> adicionaTarefa(Long tarefaId, Projeto projeto) {
        Optional<Tarefa> optionalTarefa=this.tarefaRepository.findById(tarefaId);
        if(optionalTarefa.isPresent()){
            Tarefa tarefa=optionalTarefa.get();
            int quantidadeTarefasAntes =projeto.getTarefas().size();
            projeto.addTarefa(tarefa);
            int quantidadeTarefasDepois =projeto.getTarefas().size();
            if(quantidadeTarefasAntes!=quantidadeTarefasDepois) {
                return Optional.of(tarefa);
            }
        }
        return Optional.empty();
    }




}
