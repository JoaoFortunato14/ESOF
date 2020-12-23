package EngSoftProjeto.Services;

import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Models.Tarefa;

import java.util.List;
import java.util.Optional;

public interface EmpregadoService {

    //Lista todos os Empregados
    List<Empregado> listaEmpregados();

    //Cria Empregado
    Optional<Empregado> criaEmpregado(Empregado converter);

    //Lista todos os Empregados por id
    Optional<Empregado> listaEmpregadosPorId(Long id);

    //Adiciona Tarefa a Empregado
    Optional<Empregado> adicionaTarefa(Long id, Tarefa tarefa);

}
