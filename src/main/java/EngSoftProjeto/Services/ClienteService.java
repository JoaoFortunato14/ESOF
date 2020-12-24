package EngSoftProjeto.Services;

import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Models.Projeto;
import EngSoftProjeto.Repositories.ClienteRepository;
import EngSoftProjeto.Repositories.ProjetoRepository;

import java.util.Optional;
import java.util.List;

public interface ClienteService {


    Optional<Cliente> adicionaProjeto(Long clienteId, Projeto projeto);
    Optional<Cliente> CriarCliente(Cliente cliente);
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);


}
