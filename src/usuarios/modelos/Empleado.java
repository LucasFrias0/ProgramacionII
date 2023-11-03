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
public class Empleado extends Usuario {

    //Constructor
    public Empleado (String correo, String clave, String apellido,String nombre){
      super(correo, clave, nombre, apellido);
    }
    

    @Override
    public ArrayList<Pedido> verPedidos() {
        ArrayList<Pedido> pedidos = new ArrayList();
        return pedidos;
    }

}