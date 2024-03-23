package com.example.demo;

public class Direccion {
   private int id;
   private String detalle;

   public Direccion(int id,String detalle){
      this.id= id;
      this.detalle=detalle;
   }

   public int getId(){
    return id;
   }

   public String getDetalle(){
    return detalle;
   }


}
