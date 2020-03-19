package com.company;

public class Empleado {

  private String nombre;
  private Integer numeroDeLegajo;

  public Empleado(String nombre, Integer numeroDeLegajo) {
    this.nombre = nombre;
    this.numeroDeLegajo = numeroDeLegajo;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null) return false;
    if(this.getClass() != o.getClass()) return false;

    Empleado empleadoAComparar = (Empleado) o;
    return(this.numeroDeLegajo.equals(empleadoAComparar.numeroDeLegajo));
  }


}
