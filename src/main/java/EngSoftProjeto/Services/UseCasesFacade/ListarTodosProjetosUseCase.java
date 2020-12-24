package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Repositories.ClienteRepository;
import EngSoftProjeto.Repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListarTodosProjetosUseCase {
    private final ProjetoRepository projetoRepository;

    public ListarTodosProjetosUseCase(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<Projeto> findAll() {
        List<Projeto> projetos=new ArrayList<>();
        projetoRepository.findAll().forEach(projetos::add);
        return projetos;
    }


}
