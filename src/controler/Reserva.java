package controler;

import java.util.Date;

public class Reserva extends Cliente{
    
        private int diasEstadia;
        private int personas;
        //private Date fentrada;
        //private Date fsalida;
        private String tipoHabitacion;
        private double phabitacion;
        private double ptotal;
        private boolean garage;
        

        //contructor
    public Reserva(String nombre,String cedula ,int diasEstadia,int personas, String tipoHabitacion, boolean garage){
        
        super(nombre,cedula);
        
        this.diasEstadia = diasEstadia;
        this.personas = personas;
        //this.fentrada = fentrada;
        //this.fsalida = fsalida;
        this.garage = garage;
        this.tipoHabitacion = tipoHabitacion;
               
    }
       
    
    public double precioTotal(){
        
            switch (tipoHabitacion) {
                case "individual":
                    this.phabitacion = 60000;
                    break;
                case "familiar":
                    this.phabitacion = 200000;
                    break;
                case "doble":
                    this.phabitacion = 120000;
                    break;
                default:
                    break;
            }
                                        
        return ptotal = phabitacion*diasEstadia;
    }
    
    
    public String getHabitacion(){
        return this.tipoHabitacion;
    }
    
    
    public String getGarage(){
        
        String opcion = new String();
        
        if(this.garage){                   
            opcion = "SI";             
        }
        else{           
           opcion = "NO";
        }
        
        return opcion;
    }
    
    
    
    
    public int getDias(){
        
        return this.diasEstadia;
    }
    
    
    public int getCantidaPersonas(){
      
        return this.personas;
    }
               
}

    
    
    

