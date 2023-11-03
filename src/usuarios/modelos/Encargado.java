/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;


import java.util.ArrayList;
import pedido.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Encargado extends Usuario {
    
    //Constructor
    public Encargado (String correo, String clave, String apellido, String nombre){
      super(correo, clave, nombre, apellido);
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        ArrayList<Pedido> pedidos = new ArrayList();
        return pedidos;
    }
    
        
          
}
