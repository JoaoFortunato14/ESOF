package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListarProjetosPorIdUseCase {
    private final ProjetoRepository projetoRepository;

    public ListarProjetosPorIdUseCase(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public Optional<Projeto> findById(Long id) {
        return projetoRepository.findById(id);
    }

}
