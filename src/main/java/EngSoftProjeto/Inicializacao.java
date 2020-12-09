package EngSoftProjeto;

import EngSoftProjeto.Models.*;
import EngSoftProjeto.Repositories.ClienteRepository;
import EngSoftProjeto.Repositories.EmpregadoRepository;
import EngSoftProjeto.Repositories.ProjetoRepository;
import EngSoftProjeto.Repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class Inicializacao implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private EmpregadoRepository empregadoRepository;

    @Autowired
    private TarefaRepository tarefaRepository;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //sem os asserts

       /* Cliente */

        Cliente cl= new Cliente();
        cl.setEmail("abcd@hohoh.com");
        cl.setNome("Joao B");

        clienteRepository.save(cl);

        /* Projeto */

        Cliente cl1= new Cliente();
        cl1.setEmail("abcd@hohoh.com");
        cl1.setNome("Joao B");

        Projeto p1 = new Projeto();
        p1.setNome("Projeto ESOF");
        p1.setCliente(cl1);

        projetoRepository.save(p1);

        /* Empregado */

        Empregado emp = new Empregado();
        emp.setNome("Andre B");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.setHoraValor(10);

        empregadoRepository.save(emp);


        /* Tarefa */

        Tarefa tf = new Tarefa();
        Empregado emp1 = new Empregado();
        emp1.setNome("Andre B");
        emp1.setCargo(Cargo.DesenvolvedorJr);
        emp1.setHoraValor(10);

        tf.setId(1L);
        tf.setEmpregado(emp1);
        tf.setDuracao(60);

        tarefaRepository.save(tf);



    }
}
