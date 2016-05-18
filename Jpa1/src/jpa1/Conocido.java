/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gabino
 */
@Entity

public class Conocido implements Serializable {

 private static final long serialVersionUID = 1L;

 @Id 
 @GeneratedValue(strategy = GenerationType.AUTO)

 private Long id;

 private String nombre;
 
 private String telefono;

 public Conocido() {}

 public Conocido(String nombre, String telefono) {
    this.nombre = nombre;

    this.telefono = telefono;
 }

 public Long getId() {

 return id;

 }

 public void setId(Long id) {
     this.id = id;

 }

 public String getNombre() {

 return nombre;

 }

 public void setNombre(String nombre) {

 this.nombre = nombre;

 }

 public String getTelefono() {

 return telefono;

 }

 public void setTelefono(String telefono) {

 this.telefono = telefono;

 }

 @Override 
 public int hashCode() {

 return Objects.hashCode(getId());

 }

 @Override 
 public boolean equals(Object object) {

 // Los objetos con el mismo id se consideran iguales.

 if (object instanceof Conocido) {

 final Conocido other = (Conocido) object;

 return Objects.equals(getId(), other.getId());

 } 
 else {

 return false;
 }
 }

 @Override 
 public String toString() {

 return "jpa1.Conocido[id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";

 }

}
 