package EngSoftProjeto.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void custo() {

        Empregado emp1= new Empregado();
        emp1.setNome("Joao P");
        emp1.setCargo(Cargo.DesenvolvedorJr);


    }
}