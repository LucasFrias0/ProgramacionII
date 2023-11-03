/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;
/**
 *
 * @author estudiante
 */
public class Producto {
    
    //Variables de instancia
    private int codigo;
    private String descripcion;
    private float precio;
    
    private Categoria categoria;
    private Estado estado;
    
    
    
    //Constructor
    public Producto (int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
    }
    //Constructor fin
    
    
    //Metodo encargado de mostrar los atributos
    public void mostrar() {
        System.out.println("Producto: " + descripcion 
            + "\nPrecio: " + precio + "\nCategoria: " + categoria + "\tEstado: " + estado);
    }
    
    
    //Metodos para acceder a los atributos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null)  {
            return false;
        }
        if (getClass()!=obj.getClass())
        {return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    @Override
    public int hashCode() {
        int hash =7;
        hash = 83 * hash + this.codigo;
        return hash;
    }
    
    public void AsignarCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public void AsignarPrecio(float precio){
        this.precio=precio;
    }
    
    public void AsignarDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void AsignarCategoria(Categoria categoria){
        this.categoria=categoria;
    }
    
    public void AsignarEstado(Estado estado){
        this.estado=estado;
    }
    
    public int VerCodigo(){
        return codigo;
    }
    
    public float VerPrecio(){
        return precio;
    }
    
    public String VerDescripcion(){
        return descripcion;
    }
    
    public Categoria VerCateforia(){
        return categoria;
    }
    
    public Estado VerEstado(){
        return estado;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }

    
    
}

