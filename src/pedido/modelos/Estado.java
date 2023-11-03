/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedido.modelos;

/**
 *
 * @author Gabriel
 */
public enum Estado {
    Creado("Creado"),
    Procesando("Procesando"),
    Entregado("Entregado");
    
    private String estado;
    
    private Estado(String estado){
        this.estado=estado;
    }
    
    @Override
    public String toString(){
        return "Estado: "+ estado;
    }
}
