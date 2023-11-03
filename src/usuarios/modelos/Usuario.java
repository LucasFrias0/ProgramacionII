/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.Objects;
import java.util.ArrayList;
import pedido.modelos.Pedido;

/**
 *
 * @author luqui
 */
public abstract class Usuario {
    //Variables de instancia
   private String correo;
   private String clave;
   private String nombre;
   private String apellido;

    
    //Constructor
    public Usuario(String correo, String clave, String nombre, String apellido) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Metodo mostrar()
    public void mostrar() { 
        System.out.println(apellido + ", " + nombre);
        System.out.println("Correo: " + correo);
    }
    
    
    //Metodo hashCode
    @Override
   public int hashCode(){
       int hash=7;
       hash = 83*hash + Objects.hashCode(this.correo);
       return hash;
   } 
    

    //Metodo Equals
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass().getSuperclass() != obj.getClass().getSuperclass()){
            return false;
        }
        final Usuario other = (Usuario)  obj;
        return Objects.equals(this.correo,other.correo);
        
    }
    
    //Metodos get/set
    public void AsignarCorreo(String correo){
        this.correo=correo;
    }
    
    public void AsignarClave(String clave){
        this.clave=clave;
    }
    
    public void AsignarNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void AsignarApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String VerCorreo(){
        return correo;
    }
    
    public String VerClave(){
        return clave;
    }
    
    public String verNombre(){
        return nombre;
    }
    
    public String verApellido(){
        return apellido;
    }
    
    public abstract ArrayList<Pedido> verPedidos();
    
}

