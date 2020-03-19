package com.company;

public class Alumno {

  private String nombre;
  private Integer numeroDeAlumno;

  public Alumno(String nombre, Integer numeroDeAlumno) {
    this.nombre = nombre;
    this.numeroDeAlumno = numeroDeAlumno;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null) return false;
    if(this.getClass() != o.getClass()) return false;

    Alumno alumnoAComparar = (Alumno) o;
    return(this.numeroDeAlumno.equals(((Alumno) o).numeroDeAlumno));
  }




}
