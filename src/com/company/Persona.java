package com.company;


import com.sun.org.apache.xpath.internal.operations.Bool;

public class Persona {

  private String nombre;
  private Integer dni;

  public Persona(String nombre, Integer dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null) return false;
    if(o.getClass() != this.getClass()) return false; // esto es lo mismo que preguntar si el parametro es instancia de la clase a la que se le pregunta

    Persona personaAComparar = (Persona) o;

    return(this.dni.equals(personaAComparar.getDni()));
  }



  public String getNombre() {
    return nombre;
  }

  public Integer getDni() {
    return dni;
  }
}
