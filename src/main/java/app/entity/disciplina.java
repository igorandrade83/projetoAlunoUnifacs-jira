package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DISCIPLINA
 * @generated
 */
@Entity
@Table(name = "\"DISCIPLINA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.disciplina")
public class disciplina implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "diasemana", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String diasemana;

  /**
  * @generated
  */
  @Column(name = "horario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String horario;

  /**
   * Construtor
   * @generated
   */
  public disciplina(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public disciplina setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public disciplina setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém diasemana
   * return diasemana
   * @generated
   */
  
  public java.lang.String getDiasemana(){
    return this.diasemana;
  }

  /**
   * Define diasemana
   * @param diasemana diasemana
   * @generated
   */
  public disciplina setDiasemana(java.lang.String diasemana){
    this.diasemana = diasemana;
    return this;
  }

  /**
   * Obtém horario
   * return horario
   * @generated
   */
  
  public java.lang.String getHorario(){
    return this.horario;
  }

  /**
   * Define horario
   * @param horario horario
   * @generated
   */
  public disciplina setHorario(java.lang.String horario){
    this.horario = horario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    disciplina object = (disciplina)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
