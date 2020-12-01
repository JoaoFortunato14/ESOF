package EngSoftProjeto.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
public class Cliente {

  @Id
  private String email;  //tem que ser mail pq não há dois iguais

  private String nome;

  private  List<Projeto> projetos=new ArrayList<>();  //array de projetos de cada cliente


  public void consultarCustoProjeto( Projeto pj) {
  }

  public void consultarDuracaoProjeto( Projeto pj) {
  }


  //Get's e Set's
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

  public List<Projeto> getProjetos() {
    return projetos;
  }

  public void setProjetos(List<Projeto> projetos) {
    this.projetos = projetos;
  }
}