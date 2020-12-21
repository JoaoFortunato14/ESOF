package EngSoftProjeto.Controllers;


import EngSoftProjeto.Models.Cliente;
import EngSoftProjeto.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    @Autowired
    private ClienteRepository clienterepository;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>>getAllClientes(){
        return ResponseEntity.ok(clienterepository.findAll());

    }


}
