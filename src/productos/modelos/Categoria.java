/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author Gabriel
 */
public enum Categoria {
    ENTRADA("Entrada"),
    PLATOPRINCIPAL("Plato Principal"),
    POSTRE("Postre");
    
private String categoria;

private Categoria(String categoria){
    this.categoria=categoria;
}

@Override
public String toString(){
    return  categoria;
}
}


