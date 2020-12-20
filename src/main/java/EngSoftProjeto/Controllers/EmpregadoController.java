package EngSoftProjeto.Controllers;

import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Repositories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpregadoController {

    @Autowired //injeta instancias desse tipo na variável
    private EmpregadoRepository empregadoRepository;

    @GetMapping
    public ResponseEntity<Iterable<Empregado>> getAllEmpregados(){
        return ResponseEntity.ok(empregadoRepository.findAll());
    }
}
