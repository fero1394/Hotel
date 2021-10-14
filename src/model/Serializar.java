package model;

import controller.Reserva;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializar {
    
    //creamos el array donde vamos a guardar la informacion recuperada
    ArrayList<Reserva> informacion_recuperada = new ArrayList();
    ArrayList<Reserva> temporal = new ArrayList();
    
    public void escribirEnFichero(ArrayList<Reserva> reservacion) throws FileNotFoundException, ClassNotFoundException{
        
        leerFichero();
        if(informacion_recuperada.isEmpty()){
           try{
            //Abrimos flujo de datos de entrada  al archivo
            ObjectOutputStream flujoEntrada = new ObjectOutputStream(new FileOutputStream("C://Users//User//Documents//NetBeansProjects//Hotel//src//Archivos//Archivo.dat"));
            
            //Escribe en fichero
            flujoEntrada.writeObject(reservacion);
            
            //Cerramos el flujo de entrada
            flujoEntrada.close();
            
            
            }catch(IOException e){
            
                System.out.println("Error Al escribir");
                System.out.println(e);
            } 
           
        }else{
            
            try{
            //Abrimos flujo de datos de entrada  al archivo
            ObjectOutputStream flujoEntrada = new ObjectOutputStream(new FileOutputStream("C://Users//User//Desktop//NEGOCIOS//BOTSTORE//Archivo.txt"));
            
            //Escribe en fichero
            flujoEntrada.writeObject(reservacion);
            
            //Cerramos el flujo de entrada
            flujoEntrada.close();
            
            
            }catch(IOException e){
            
                System.out.println("Error Al escribir");
                System.out.println(e);
            } 
        }
        
        
    }   
    
    public void leerFichero() throws FileNotFoundException, ClassNotFoundException{
        
        try{
            //Abrimos flujo de datos de salida del archivo
            ObjectInputStream flujoSalida = new ObjectInputStream(new FileInputStream("C://Users//User//Documents//NetBeansProjects//Hotel//src//Archivos//Archivo.dat"));
            
            /*
                read.object nos devuelve un objeto , realizamos el casting 
                para decirle que es del tipo (Reserva[])
            */
            informacion_recuperada = (ArrayList<Reserva>) flujoSalida.readObject();
                        
            System.out.println("Lei el fichero");
            
            flujoSalida.close();
            
            
            
        }catch(IOException e){
            System.out.println("Error al leer");
            System.out.println(e);
        }      
    }
    
    public void mostrarFichero(){       
        //leerFichero();       
        for(Reserva a: informacion_recuperada){
                System.out.println(a.nombreCliente());
                System.out.println(a.cedulaCliente());
                System.out.println(a.getFechaEntrada());
                System.out.println(a.getFechaSalida());
                System.out.println(a.getCantidaPersonas());
                System.out.println(a.getHabitacion());
                System.out.println(a.getGarage());
                
        }
    }
    
    public ArrayList<Reserva> getarrayObjeto() throws FileNotFoundException, ClassNotFoundException{
        try{
            //Abrimos flujo de datos de salida del archivo
            ObjectInputStream flujoSalida = new ObjectInputStream(new FileInputStream("C://Users//User//Documents//NetBeansProjects//Hotel//src//Archivos//Archivo.dat"));
            
            /*
                read.object nos devuelve un objeto , realizamos el casting 
                para decirle que es del tipo (Reserva[])
            */
            temporal= (ArrayList<Reserva>) flujoSalida.readObject();
                        
            System.out.println("Lei el fichero");
            
            flujoSalida.close();
            
            
            
        }catch(IOException e){
            System.out.println("Error al leer");
            System.out.println(e);
        }      
        return temporal;
    }
}

