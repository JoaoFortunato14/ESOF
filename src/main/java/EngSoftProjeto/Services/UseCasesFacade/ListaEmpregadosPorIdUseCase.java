package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Repositories.EmpregadoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListaEmpregadosPorIdUseCase {

    private final EmpregadoRepository empregadoRepository;

    public ListaEmpregadosPorIdUseCase(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    public Optional<Empregado> findById(Long id){
        return empregadoRepository.findById(id);
    }
}
