/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import productos.modelos.Producto;

/**
 *
 * @author Gabriel
 */
public class ProductoDelPedido {
    private Producto producto;
    private int cantidad;

    public ProductoDelPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void mostrar() {
        
        System.out.println("\t" + producto.VerDescripcion() + "\t" + cantidad);
    }
    
    @Override
    public boolean equals(Object o) {
    if (o == null) {
        return false;
    }
    if (o == this) {
        return true;
    }
    if (getClass() != o.getClass()) {
        return false;
    }
    ProductoDelPedido otroProductoDelPedido = (ProductoDelPedido) o;
    return this.producto.equals(otroProductoDelPedido.producto);
    }
    
    @Override
    public int hashCode() {
    int hash = 5;
    hash = 67 * hash + this.producto.VerCodigo();
    return hash;
    }

    
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

