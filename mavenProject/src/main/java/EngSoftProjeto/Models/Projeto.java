package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Projeto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @ManyToOne
  @JsonIgnore
  private Cliente cliente;

  @OneToMany(mappedBy = "projeto")
  @JsonIgnore
  public List<Tarefa> tarefas =new ArrayList<Tarefa>();

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
  public int getProjetoDuracao() {
    return this.duracao();
  }
  public int getProjetoCusto() {
    return this.custoProjeto();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


    //Adicionar tarefa a lista
    public void addTarefa(Tarefa tf)
    {
        if(!tarefas.contains(tf)){
            tarefas.add(tf);
            tf.setProjeto(this);
        }
    }

    //Remover tarefa da lista
    public void removeTarefa(Tarefa tf)
    {
        if(tarefas.contains(tf)){
            tarefas.remove(tf);
        }
    }

}