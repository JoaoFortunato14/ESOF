package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Repositories.ClienteRepository;
import EngSoftProjeto.Repositories.ProjetoRepository;
import EngSoftProjeto.Repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CriarProjetoUseCase {
    private final ClienteRepository clienteRepository;
    private final ProjetoRepository projetoRepository;
    private final TarefaRepository tarefaRepository;


    public CriarProjetoUseCase(ClienteRepository clienteRepository, ProjetoRepository projetoRepository, TarefaRepository tarefaRepository) {
        this.clienteRepository = clienteRepository;
        this.projetoRepository = projetoRepository;
        this.tarefaRepository = tarefaRepository;
    }

    public Optional<Projeto> criarProjeto(Projeto projeto) {
        Optional<Projeto> optionalProjeto=projetoRepository.findById(projeto.getId());
        if(optionalProjeto.isEmpty()){
            projetoRepository.save(projeto);
            List<Tarefa> tarefas=new ArrayList<>();
            projeto.getTarefas().forEach(tarefa -> {
                Optional<Tarefa> optionalTarefa=tarefaRepository.findById(tarefa.getId());
                if(optionalTarefa.isPresent()){
                    tarefas.add(tarefa);
                    projeto.addTarefa(tarefa);
                    projetoRepository.save(optionalProjeto.get());
                }
            });
            projeto.setTarefas(tarefas);
            return Optional.of(projetoRepository.save(projeto));
        }
        return Optional.empty();
    }



}
