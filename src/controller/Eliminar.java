package controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import model.Serializar;

public class Eliminar {
    
    //variables
    private String Eliminado;    
    private Serializar eliminarcliente;
    private String nombre;
    private String cedula;
    private String habitacion;
    private String entrada;
    private String salida;
    private int cantidadPersonas;
    private int dias;
    private String garaje;
    private double precioTotal;
    
    private boolean seElimino;
    
    
    //Constructor
    public Eliminar(String Eliminado){
        this.Eliminado = Eliminado;
    }
    
    
    public void procesoEliminacion() throws ClassNotFoundException, FileNotFoundException{
      
        eliminarcliente = new Serializar();
        
        for(int i=0;i<eliminarcliente.getTemporal();i++){
            
            if(eliminarcliente.rescribir(i).nombreCliente().equalsIgnoreCase(Eliminado) || eliminarcliente.rescribir(i).cedulaCliente().equalsIgnoreCase(Eliminado)){
                
                ArrayList<Reserva> lista = new ArrayList<Reserva>();
                
                lista = eliminarcliente.buscarFichero(); 
                
                asignaEliminado(lista.get(i));
                
                lista.remove(i);
                
                eliminarcliente.escribirEnFichero(lista);
                
                seElimino = true;
            }            
        }               
    }
    private void asignaEliminado(Reserva objetoEliminado){            
        nombre = objetoEliminado.nombreCliente();
        cedula = objetoEliminado.cedulaCliente();
        habitacion = objetoEliminado.getHabitacion();
        entrada = objetoEliminado.getFechaEntrada();
        salida = objetoEliminado.getFechaSalida();
        cantidadPersonas = objetoEliminado.getCantidaPersonas();
        dias = objetoEliminado.getDias();
        garaje = objetoEliminado.getGarage();                       
        precioTotal = objetoEliminado.precioTotal();
                              
    }
    public String muestraEliminado(){
        if(seElimino == true){
           String imprime = "\t\t---------------RESERVA---------------"+
                        "\n\n\t\tNOMBRE: "+nombre+
                        "\n\t\tCEDULA: "+cedula+
                        "\n\t\tHABITACION: "+habitacion+
                        "\n\t\tFECHA ENTRADA: "+entrada+
                        "\n\t\tFECHA SALIDA: "+salida+
                        "\n\t\tCANTIDAD PERSONAS: "+cantidadPersonas+
                        "\n\t\tDIAS ESTADIA: "+dias+
                        "\n\t\tGARAGE: "+garaje+
                        "\n\n\t\t----TOTAL A PAGAR----"+
                        "\n\t\tPRECIO TOTAL: "+ precioTotal;
           seElimino = false;
           return imprime;           
        }else{
            return "No se pudo Eliminar Reserva";
        }                       
    }
        
}
