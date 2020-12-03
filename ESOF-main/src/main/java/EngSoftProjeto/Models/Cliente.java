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

 public ArrayList<Projeto> projetos =new ArrayList<Projeto>();  //array de projetos de cada cliente



    public boolean consultarCustoProjeto( Projeto pj) {
    for(Projeto p: projetos){
      if(p.equals(pj)){
        return true ;//pj.custoProjeto();

      }
    }


    return false;
  }

  public boolean consultarDuracaoProjeto( Projeto pj) {
      for (Projeto p : projetos) {
          if (p.equals(pj)) {
              return  true ; //pj.duracao();

          }

      }
      return false;
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

  public ArrayList<Projeto> getProjetos() {
    return projetos;
  }

  public void setProjetos(ArrayList<Projeto> projetos) {
    this.projetos = projetos;
  }
}