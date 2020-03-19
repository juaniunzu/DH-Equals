package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      System.out.println("---------------------------------- Clase Persona ------------------------------");
      Persona pepe = new Persona("pepe", 123123123);
      Persona otroPepe = new Persona("otro pepe", 123123123);

      System.out.println(pepe.equals(otroPepe));

      System.out.println("---------------------------------- Clase Coca ------------------------------");

      Coca unaCoca = new Coca(350, 70.0);
      Coca otraCoca = new Coca(350, 80.0);

      System.out.println(unaCoca.equals(otraCoca));

      System.out.println("---------------------------------- Clase Alumno ------------------------------");

      Alumno richar = new Alumno("richar", 123123);
      Alumno yoni = new Alumno("yoni", 456456);
      Alumno nacho = new Alumno("nacho", 234234);
      Alumno nahuel = new Alumno("nahuel", 345345);

      ArrayList<Alumno> listaDeAlumnos = new ArrayList<Alumno>();
      listaDeAlumnos.add(richar);
      listaDeAlumnos.add(yoni);
      listaDeAlumnos.add(nacho);
      listaDeAlumnos.add(nahuel);

      Alumno richarTrucho = new Alumno("richar trucho", 123123);

      System.out.println(listaDeAlumnos.contains(richarTrucho));

      System.out.println("---------------------------------- Clase Empleado ------------------------------");

      ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();

      Empleado manu = new Empleado("manu", 123123);
      Empleado bern = new Empleado("bern", 234234);
      Empleado ive = new Empleado("ive", 354345);
      Empleado asa = new Empleado("asa", 456456);

      listaDeEmpleados.add(manu);
      listaDeEmpleados.add(bern);
      listaDeEmpleados.add(ive);
      listaDeEmpleados.add(asa);

      Empleado asaTrucho = new Empleado("asa trucho", 456456);

      System.out.println(listaDeEmpleados.contains(asaTrucho));



    }
}
