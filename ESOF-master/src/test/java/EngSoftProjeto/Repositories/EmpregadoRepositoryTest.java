package EngSoftProjeto.Repositories;

import EngSoftProjeto.Models.Cargo;
import EngSoftProjeto.Models.Empregado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmpregadoRepositoryTest {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    @Test
    public void testCriarEmpregado(){

        Empregado emp = new Empregado();
        emp.setNome("Andre B");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(10);

        assertEquals(0, empregadoRepository.count());

        empregadoRepository.save(emp);

        assertEquals(1, empregadoRepository.count());
    }


}