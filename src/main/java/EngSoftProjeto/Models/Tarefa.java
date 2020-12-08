package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Empregado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Tarefa {

  @Id
  private Long id;

  private Empregado empregado;

  private Integer duracao;  //duracao é minutos

  @Transient
  //@ManyToOne  //pq é que nao é possivel mapear tarefas??
  public List<Projeto> projetos= new ArrayList<>();


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