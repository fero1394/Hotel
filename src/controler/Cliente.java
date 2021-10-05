
package controler;

public class Cliente {
    
    private final String nombre;
    private final String cedula;
    
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
