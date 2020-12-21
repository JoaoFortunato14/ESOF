package EngSoftProjeto.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String email;  //tem que ser mail pq não há dois iguais

  private String nome;

  @OneToMany(mappedBy = "cliente")
  public  List<Projeto> projetos=new ArrayList<>();  //array de projetos de cada cliente



  public int consultarCustoProjeto(Projeto pj) {

    for (Projeto p : projetos) {
      if (p.equals(pj)) {
        return pj.custoProjeto();
      }
    }
    return 0;
  }

  public int consultarDuracaoProjeto(Projeto pj) {

    for (Projeto p : projetos) {
      if(p.equals(pj)) {
        return pj.duracao();
      }
    }
    return 0;
  }


  //Get's e Set's

  public Long getId() {
    return id;
  }



  public int getProjetoDuracao(Projeto p) {
    if (projetos.contains(p)){
      return p.duracao();

    }
    return 0;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  //Adicionar a lista
  public void addProjeto(Projeto p1) {
    if(!projetos.contains(p1)){
      projetos.add(p1);
      p1.setCliente(this);
    }
  }

  //Remover projeto da lista
  public void removeProjeto(Projeto pj)
  {
    if(projetos.contains(pj)){
      projetos.remove(pj);
    }
  }
}