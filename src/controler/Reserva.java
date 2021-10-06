package controler;

import java.time.LocalDate;

public class Reserva extends Cliente{
    
        private int diasEstadia;
        private int personas;
        private String fentrada;
        private String fsalida;
        private String tipoHabitacion;
        private double phabitacion;
        private double ptotal;
        private boolean garage;
        LocalDate entrada;
        LocalDate salida;
        

        //contructor
    public Reserva(String nombre,String cedula ,String fentrada,String fsalida,int personas, String tipoHabitacion, boolean garage){
        
        super(nombre,cedula);
        
        this.personas = personas;
        this.fentrada = fentrada;
        this.fsalida = fsalida;
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
        entrada = LocalDate.parse(fentrada);
        salida = LocalDate.parse(fsalida);
                                        
        return ptotal = phabitacion*((salida.getDayOfYear())-(entrada.getDayOfYear()));
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
        
        entrada = LocalDate.parse(fentrada);
        salida = LocalDate.parse(fsalida);
        
        diasEstadia = (salida.getDayOfYear())-(entrada.getDayOfYear());
        
        return diasEstadia;
    }
    
    
    public int getCantidaPersonas(){
      
        return this.personas;
    }
    
    
    public String getFechaEntrada(){
        
        return this.fentrada;
    }
    
    
    public String getFechaSalida(){
        
        return this.fsalida;
    }
    
}

    
    
    

