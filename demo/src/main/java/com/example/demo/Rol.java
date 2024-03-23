package com.example.demo;

public class Rol {
    private int id;
    private String descripcion;


    public Rol(int id, String descripcion) { 
      this.id= id;
      this.descripcion=descripcion;
    }

    public int getId(){
      return id;
    }
    
    public String getDescripcion(){
      return descripcion;
    }

}
