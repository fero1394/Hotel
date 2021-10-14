
package controler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buscar {
    
    private final String elemento;
    
    
    public Buscar(String elemento){ 
        
        this.elemento=elemento;
        
    }
    
    
    public String buscarCliente() throws ClassNotFoundException{
        
        try{
            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C://Users//User//Documents//Documentos_FERNANDO//CURSOS_DE_PROGRAMACION//Curso JAVA//Acceso_Fichero//empleado.dat"));
            
            ArrayList <Reserva> listaCliente = (ArrayList <Reserva>) recuperando_fichero.readObject();
            
            recuperando_fichero.close();
            
            
            for (int i = 0; i < listaCliente.size(); i++) {
            
                if (listaCliente.get(i).nombreCliente().equalsIgnoreCase(elemento) || listaCliente.get(i).cedulaCliente().equalsIgnoreCase(elemento)){

                    System.out.println(
                     "\nNOMBRE: " + listaCliente.get(i).nombreCliente()
                    + "\nCEDULA: " + listaCliente.get(i).cedulaCliente()
                    + "\nHABITACION: " + listaCliente.get(i).getHabitacion()
                    + "\nFECHA ENTRADA: " + listaCliente.get(i).getFechaEntrada()
                    + "\nFECHA SALIDA: " + listaCliente.get(i).getFechaSalida()
                    + "\nCANTIDAD PERSONAS: " + listaCliente.get(i).getCantidaPersonas()
                    + "\nDIAS DE ESTADIA: " + listaCliente.get(i).getDias()
                    + "\nGARAGE: " + listaCliente.get(i).getGarage()
                    +"\n--------------------------"
                    + "\nPRECIO TOTAL: " + listaCliente.get(i).precioTotal());
                }
            }
        
            }catch(IOException e){
            
            JOptionPane.showMessageDialog(null, "Problemas con el fichero que contiene la lista de clientes");
            
        }
        
        return "DISFRUTE SU ESTADIA";
       
    }
    
}
