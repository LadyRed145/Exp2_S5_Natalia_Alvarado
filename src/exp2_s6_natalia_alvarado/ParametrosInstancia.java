
package exp2_s6_natalia_alvarado;

public class ParametrosInstancia {
public String nombre;     
public int[][] reservas;
public int[] asientos;
public double descuento;
public int totalDescuento;

// Constructor
    
public ParametrosInstancia(){
    reservas = llenarReservAsientos();
    asientos = llenarAsientos();
}

public int[][] llenarReservAsientos(){
    
    // Reserva de Asientos
    // 1 = Asiento Libre
    
 int[][] VariablesInstancia = {{1,1,1,1}
                              ,{1,1,1,1}
                              ,{1,1,1,1}
                              ,{1,1,1,1}
                              ,{1,1,1,1}
 };
    
    
    
 return VariablesInstancia;   

}
// Metodo 

public int[] llenarAsientos(){
    int[] asientos = {1,2,3,4,5};




    return asientos; 
    
    
    
    
    }
}