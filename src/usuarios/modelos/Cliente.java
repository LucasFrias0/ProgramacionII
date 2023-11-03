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
public class Cliente extends Usuario {
    
    public ArrayList<Pedido>  pedidoCliente = new ArrayList<>();
    
    //Constructor
    public Cliente (String correo, String clave, String apellido,String nombre){
      super(correo, clave, nombre, apellido);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidoCliente;
    }
    
    public void agregarPedido(Pedido pedido){
        if (!pedidoCliente.contains(pedido)){
            pedidoCliente.add(pedido);
        }
        else{
            pedidoCliente.set(pedidoCliente.indexOf(pedido), pedido);
        }
    }

    public void cancelarPedido(Pedido pedido){
        if(pedidoCliente.contains(pedido)){
            pedidoCliente.remove(pedido);
        }
    }
    
    

    
    

    
    
}
