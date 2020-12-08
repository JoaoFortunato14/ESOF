package EngSoftProjeto.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {

  @Id
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

  public void setProjetos(ArrayList<Projeto> projetos) {
    this.projetos = projetos;
  }
}