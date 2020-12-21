package EngSoftProjeto.Controllers;

import EngSoftProjeto.Models.Tarefa;
import EngSoftProjeto.Repositories.TarefaRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TarefaController {

    @Autowired
    private TarefaRepository tarefarep;

    @GetMapping
    public ResponseEntity<Iterable<Tarefa>>getAllTarefas(){
        return ResponseEntity.ok(tarefarep.findAll());
    }


}
