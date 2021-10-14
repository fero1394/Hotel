package hotel;

import java.io.FileNotFoundException;
import model.Serializar;

public class Hotel {

    
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Serializar muestra = new Serializar();
        
        muestra.leerFichero();
        muestra.mostrarFichero();
    }
    
}
