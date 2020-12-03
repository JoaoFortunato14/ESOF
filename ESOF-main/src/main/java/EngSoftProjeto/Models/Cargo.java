package EngSoftProjeto.Models;

public enum Cargo {

    DesenvolvedorJr(10), AnalistaJr(20), DesenvolvedorSr(40), AnalistaSr(80);

    private int salarioHora;

    //construtor
    Cargo(int salarioHora) {
        this.salarioHora=salarioHora;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

}
