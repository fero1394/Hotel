
package controler;

public class Prueba {
    public static void main(String[] args){
        
        Reserva usuario = new Reserva("felipe","1036650151",4,2,"doble",true);
        
        System.out.println("--------HOTEL----------"
                + "\nNOMBRE: " + usuario.nombreCliente()
                + "\nCEDULA: " + usuario.cedulaCliente()
                + "\nHABITACION: " + usuario.getHabitacion()
                + "\nCANTIDAD PERSONAS: " + usuario.getCantidaPersonas()
                + "\nDIAS DE ESTADIA: " + usuario.getDias()
                + "\nGARAGE: " + usuario.getGarage()
                +"\n--------------------------"
                + "\nPRECIO TOTAL: " + usuario.precioTotal());
    }
}
