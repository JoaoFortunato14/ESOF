package EngSoftProjeto.Services.UseCasesFacade;

import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Repositories.EmpregadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListaEmpregadosUseCase {

    //atributo
    private final EmpregadoRepository empregadoRepository;

    //Construtor
    public ListaEmpregadosUseCase(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    //método
    public List<Empregado> findAll(){
        List<Empregado> empregados= new ArrayList<>();
        empregadoRepository.findAll().forEach(empregados::add);
        return empregados;
    }

}
