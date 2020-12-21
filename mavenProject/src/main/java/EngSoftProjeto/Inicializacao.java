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

       /* Cliente */

        Cliente cl= new Cliente();
        cl.setEmail("abcd@hohoh.com");
        cl.setNome("Joao B");

        clienteRepository.save(cl);

        /* Projeto */
        Tarefa tf = new Tarefa();
        Tarefa tf1 = new Tarefa();

        Projeto p1 = new Projeto();
        p1.setNome("Projeto ESOF");
        p1.setCliente(cl);
        p1.addTarefa(tf);
        p1.addTarefa(tf1);


        projetoRepository.save(p1);

        /*  Empregado  */

        Empregado emp = new Empregado();
        emp.setNome("Andre B");
        emp.setCargo(Cargo.DesenvolvedorJr);
        emp.custo(emp.getCargo());

        empregadoRepository.save(emp);


        /* Tarefas */



        tf.setId(1L);
        tf.setEmpregado(emp);
        tf.setDuracao(60);


        tf1.setId(2L);
        tf1.setEmpregado(emp);
        tf1.setDuracao(60);


        tarefaRepository.save(tf);
        tarefaRepository.save(tf1);


    }
}
