package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Empregado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//@Entity
public class Tarefa {

  @Id
  private Long id;

  private Empregado empregado;

  private Integer duracao;  //duracao é minutos

  public boolean custoTarefa(Integer dur) {

      return false;
  }


  //Get's e Set's
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Empregado getEmpregado() {
    return empregado;
  }

  public void setEmpregado(Empregado empregado) {
    this.empregado = empregado;
  }

  public Integer getDuracao() {
    return duracao;
  }

  public void setDuracao(Integer duracao) {
    this.duracao = duracao;
  }
}