package com.example.demo;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String user;
    private String password;
    private List<Rol> roles;
    private List<Direccion> direcciones;

    public Usuario(int id, String nombre, String user ,String password, List<Rol> roles,List<Direccion> direcciones ){
        this.id= id;
        this.nombre= nombre;
        this.user= user;
        this.password= password;
        this.roles = roles;
        this.direcciones = direcciones;
    }

    //GETTERS @
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getUsuer(){
        return user;
    }

    public String getPassword(){
        return password;
    }

    public List<Rol> getRoles(){
        return roles;
    }

    public List<Direccion> getDirecciones(){
        return direcciones;
    }

}
