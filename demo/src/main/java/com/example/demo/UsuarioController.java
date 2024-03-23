package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();


    public  UsuarioController(){
        usuarios.add(new Usuario(1, "Felipe Meza Mora", "fmeza", "asd123",
        Arrays.asList(new Rol(1, "Administrador comercial"), new Rol(2, "Marketing"), new Rol(3, "Contabilidad")),
        Arrays.asList(new Direccion(1, "Principal: Alcalde Pedro Alarcón 887, San Miguel"),new Direccion(2, "Secundaria: Pasaje San Gabriel 11443, La Florida"))));

        usuarios.add(new Usuario(2, "María Rodriguez", "mrodriguez", "qwe456",
        Arrays.asList(new Rol(2, "Ventas"), new Rol(3, "Soporte técnico")),
        Arrays.asList(new Direccion(1, "Calle Principal 123, Ciudad"), new Direccion(2, "Avenida Libertad 456, Pueblo Nuevo"))));

         usuarios.add(new Usuario(3, "Juan Pérez", "jperez", "zxc789",Arrays.asList(new Rol(4, "Recursos humanos"), new Rol(5, "Atención al cliente")), Arrays.asList(new Direccion(1, "Carrera 7 # 123-45, Bogotá"), new Direccion(2, "Calle 10 # 34-56, Medellín"))));

        usuarios.add(new Usuario(4, "Ana López", "alopez", "abc321",Arrays.asList(new Rol(6, "Desarrollador"), new Rol(7, "Diseñador")),Arrays.asList(new Direccion(1, "Avenida Primera 123, Santiago"), new Direccion(2, "Calle Principal 456, Buenos Aires"))));

    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public Object getUsuarios(@PathVariable int id) {
        String alerta= "No existe";
        for(Usuario usuario: usuarios){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return alerta;
    }

    @GetMapping("/usuarios/{id}/roles")
    public List<Rol> getRoles(@PathVariable int id){
        for(Usuario usuario: usuarios){
            if(usuario.getId() == id){
                return usuario.getRoles();
            }
        }
        return null;
    }


    @GetMapping("/usuarios/{id}/direcciones")
    public List<Direccion> getDireccions(@PathVariable int id){
        for(Usuario usuario: usuarios){
            if(usuario.getId() == id){
                return usuario.getDirecciones();
            }
        }
        return null;
    }


}
