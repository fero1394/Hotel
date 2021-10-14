
package controller;

import java.io.Serializable;

public class Cliente implements Serializable{
    
    private final String nombre;
    private final String cedula;
    
    private static final long serialVersionUID = 1L;
    
    public Cliente(String nombre,String cedula){
        
        this.nombre = nombre;
        this.cedula = cedula;
        
    }

    
    public String nombreCliente(){
        return nombre;
    }
    
    
    
    public String cedulaCliente(){
        return cedula;
    }
  
}
