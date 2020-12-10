package EngSoftProjeto.Repositories;

import EngSoftProjeto.Models.Cargo;
import EngSoftProjeto.Models.Empregado;
import EngSoftProjeto.Models.Tarefa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TarefaRepositoryTest {


    @Autowired
    private TarefaRepository tarefaRepository;

    @Autowired
    private EmpregadoRepository empregadoRepository;

    @Test
    public void testeCriarTarefa(){

        //ERRO
        Tarefa tf = new Tarefa();
        Empregado emp1 = new Empregado();


        emp1.setNome("Andre B");
        emp1.setCargo(Cargo.DesenvolvedorJr);
        emp1.setHoraValor(10);

        tf.setEmpregado(emp1);
        tf.setDuracao(60);


        assertEquals(0, tarefaRepository.count());
        assertEquals(0, empregadoRepository.count());

        tarefaRepository.save(tf);
        //empregadoRepository.save(emp1);

        //só depois de haver tarefas no array,é que se as pode adicionar a empregado, pois vai comparar no array para ver se contem
        emp1.addTarefa(tf);

        //tarefaRepository.save(tf);
        empregadoRepository.save(emp1);

        assertEquals(1, tarefaRepository.count());
        assertEquals(1, empregadoRepository.count());

    }
}