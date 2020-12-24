package EngSoftProjeto.Services;

import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Models.Tarefa;

import java.util.List;
import java.util.Optional;

public interface ProjetoService {

    Optional<Tarefa> adicionaTarefa(Long tarefaId, Projeto projeto);
    Optional<Projeto> findById(Long id);
    public List<Projeto> findAll();
    Optional<Projeto> criarProjeto(Projeto projeto);


}
