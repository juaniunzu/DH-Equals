package com.company;

public class Coca {

  private Integer tamanio;
  private Double precio;

  public Coca(Integer tamanio, Double precio) {
    this.tamanio = tamanio;
    this.precio = precio;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null) return false;
    if(this.getClass() != o.getClass()) return false;

    Coca cocaAComparar = (Coca) o;
    return(this.tamanio.equals(((Coca) o).tamanio));

  }


}
