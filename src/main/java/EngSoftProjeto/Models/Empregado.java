package EngSoftProjeto.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//@Entity
public class Empregado {

  @Id
  private String nome;

  private Cargo cargo;

  private Integer horaValor;

  //Criacao

  //custo valor-hora de um empregado
  public int custo(Cargo cg) {

    switch (cg){
      case DesenvolvedorJr:
        horaValor=cargo.DesenvolvedorJr.getSalarioHora();
        break;

      case DesenvolvedorSr:
        horaValor=cargo.DesenvolvedorSr.getSalarioHora();
        break;

      case AnalistaJr:
        horaValor=cargo.AnalistaJr.getSalarioHora();
        break;

      case AnalistaSr:
        horaValor=cargo.AnalistaSr.getSalarioHora();
        break;

        default:
          System.out.println("Cargo nao existente!\n");

    }
    return horaValor;
  }


  //Get's e Set's
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Enum getCargo() {
    return cargo;
  }

  public Integer getHoraValor() {
    return horaValor;
  }

}