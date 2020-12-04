package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Cliente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
//@Entity
public class Projeto {

  @Id
  private String nome;
  private Cliente cliente;
  public ArrayList<Tarefa> tarefas =new ArrayList<Tarefa>();

  public int custoProjeto( ){
    int custo=0;

    for(Tarefa t: tarefas){
      custo+= t.custoTarefa(this.duracao(), t.getEmpregado().getHoraValor());

    }
    return custo;
  }

  public int duracao() {

    int sumDur=0;
    for(Tarefa t: tarefas){
      sumDur+= t.getDuracao();
    }
    return sumDur;
  }

  //Get's e Set's
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


}