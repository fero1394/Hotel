
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buscar {
    
    private final String elemento;
    
    private String nombre;
    private String cedula;
    private String habitacion;
    private String entrada;
    private String salida;
    private int cantidadPersonas;
    private int dias;
    private String garaje;
    private double precioTotal;
    private boolean encontrado;
    
    
    public Buscar(String elemento){ 
        
        this.elemento=elemento;
        
    }
    
    
    
    
    
    public boolean EstaCliente() throws ClassNotFoundException{
        
        
        try{
            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C://Users//User//Documents//Documentos_FERNANDO//CURSOS_DE_PROGRAMACION//Proyectos JAVA//Hotel//src//Archivos//Archivo.dat"));
            
            ArrayList <Reserva> listaCliente = (ArrayList <Reserva>) recuperando_fichero.readObject();
            
            recuperando_fichero.close();
            
            
            for (int i = 0; i < listaCliente.size(); i++) {
            
                if (listaCliente.get(i).nombreCliente().equalsIgnoreCase(elemento) || listaCliente.get(i).cedulaCliente().equalsIgnoreCase(elemento)){
                    
                    this.nombre = listaCliente.get(i).nombreCliente();
                    this.cedula = listaCliente.get(i).cedulaCliente();
                    this.habitacion = listaCliente.get(i).getHabitacion();
                    this.entrada = listaCliente.get(i).getFechaEntrada();
                    this.salida = listaCliente.get(i).getFechaSalida();
                    this.cantidadPersonas = listaCliente.get(i).getCantidaPersonas();
                    this.dias = listaCliente.get(i).getDias();
                    this.garaje = listaCliente.get(i).getGarage();
                    this.precioTotal = listaCliente.get(i).precioTotal();
        
                    this.encontrado=true;

                }
                else{
                    this.encontrado=false;
                }
            }
        
            }catch(IOException e){
            
            JOptionPane.showMessageDialog(null, "Problemas con el fichero que contiene la lista de clientes");
        
        }
        
        return encontrado;
       
    }
    
    public String getNombre(){
        
        return nombre;
    }  

    
    public String getCedula(){
        
        return cedula;
    }  

    public String getHabitacion(){
        
       return habitacion;
    }         
    
        public String getEntrada(){
        
        return entrada;
    }  
    
        public String getSalida(){
        
        return salida;
    }  
        
        
    public int getCantPersonas(){
        
        return cantidadPersonas; 
    }  
    
    public int getDias(){
        
        return dias;
    }  
        
    public String getGaraje(){
        
        return garaje;
    }  
    
    public double getPrecioTotal(){
        
        return precioTotal;
    }  
    
    public boolean getEsta(){
        
        return encontrado;
    }
        
        
        
}
