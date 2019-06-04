package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FOTOFULL
 * @generated
 */
@Entity
@Table(name = "\"FOTOFULL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.fotoFull")
public class fotoFull implements Serializable {

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
  @Column(name = "fofo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String foto;

  /**
   * Construtor
   * @generated
   */
  public fotoFull(){
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
  public fotoFull setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public fotoFull setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    fotoFull object = (fotoFull)obj;
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
