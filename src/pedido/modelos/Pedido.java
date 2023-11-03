/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author Gabriel
 */
public class Pedido {
    
    //Variables de instancia
    private int numero;
    private LocalDateTime fechayHora;
    
    private Cliente cliente;
    private Estado estado;
    private ArrayList<ProductoDelPedido> pDp= new ArrayList<>();

    //Constructor
    public Pedido(int numero, LocalDateTime fechayHora, ArrayList<ProductoDelPedido> pDp, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.estado = estado.Creado;
        this.fechayHora=fechayHora;
        this.pDp = pDp;
    }

    public void mostrar() {
        System.out.println("\n\nNro: " + numero);
        System.out.println("\nFecha: " + this.fechayHora.format(this.formatoFecha())
                +"\t\t\tHora: " + this.fechayHora.format(formatoHora()));
        System.out.println("Cliente: " + cliente.verApellido() + ", " + cliente.verNombre());
        System.out.println("Estado: " + this.estado.name());
        System.out.println("\tProducto\tCantidad");
        System.out.println("\t==========================");
        for (ProductoDelPedido pdp : pDp) {
            pdp.mostrar();
        }
    }
    
    
    private DateTimeFormatter formatoFecha(){
        return DateTimeFormatter.ofPattern("dd/MM/yy");
    }
    
    private DateTimeFormatter formatoHora(){
        return DateTimeFormatter.ofPattern("hh:mm");
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass()!=obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido)obj;
        return this.numero == other.numero;
    }
    
    @Override
    public int hashCode() {
        int hash =7;
        hash= 83 * hash + this.numero;
        return hash;
    }
    
    //Metodos get/set
    
    public void AsignarNumero(int numero){
        this.numero=numero;
    }
    
    public void AsignarfechaYHora(LocalDateTime fechaYHora){
        this.fechayHora=fechaYHora;
    }
    
    public void AsignarCliente(Cliente cliente){
        this.cliente=cliente;
    }
    
    public void AsignarEstado(Estado estado){
        this.estado=estado;
    }
    
    public void AsignarProductoDelPedido (ArrayList<ProductoDelPedido> pdp){
        this.pDp=pdp;
    }
    
    public int VerNumero(){
        return numero;
    }
    
    public Cliente VerCliente(){
        return cliente;
    }
    
    public Estado VerEstado(){
        return estado;
    }
    
    public ArrayList<ProductoDelPedido> VerProductoDelPedido(){
        return pDp;
    }
    
    
        
        
    }
    

