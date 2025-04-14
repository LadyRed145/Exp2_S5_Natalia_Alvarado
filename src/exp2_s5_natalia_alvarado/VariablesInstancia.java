package exp2_s5_natalia_alvarado;

public class VariablesInstancia {
 
public String nombre;     
public int[][] reservas;
public int[] asientos;
public double descuento;
public int totalDescuento;

// Constructor
    
public VariablesInstancia(){
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









