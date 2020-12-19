package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Empregado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Tarefa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Empregado empregado;

  private Integer duracao;  //duracao é minutos

  @ManyToOne
  private Projeto projeto;


  public int custoTarefa(Integer dur, Integer empValor) {
    int custo=0;
    //passa min para horas, consideramos minimo aceitável 60 min
    int hora= dur/60;
    custo= hora * empValor;

    return custo;
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