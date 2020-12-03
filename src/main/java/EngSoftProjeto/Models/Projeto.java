package EngSoftProjeto.Models;

import EngSoftProjeto.Models.Cliente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//@Entity
public class Projeto {

  @Id
  private String nome;

  public void custoProjeto( ) {

  }

  public void duracao() {
  }

  //Get's e Set's
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


}