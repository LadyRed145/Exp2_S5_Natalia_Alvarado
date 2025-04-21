
package exp2_s6_natalia_alvarado;

import java.io.IOException;
import java.util.Scanner;

public class Exp2_S6_Natalia_Alvarado {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        ParametrosInstancia teatroMoro = new ParametrosInstancia ();
        
     //Variables Locales
  
    int opcion;
    int i;
    int butaca;
    int edad;
    String fila;
    String pagar = null;
    String salir;
    
     //Entrada De Datos
  
    int filaA = 0;
    int filaB = 0;
    int filaC = 0;
    int filaD = 0;
    int filaNumero = 0;
    int total = 0;
    int valorButaca = 0;
    boolean pagoPositivo;
    
       //Proceso
  
       //Menu Principal
  
    do{
        opcion = 0;
        System.out.println("Bienvenido Al Teatro Moro!");
        System.out.println("Menu Principal");
        System.out.println("1.- Compra de Entradas e Impresion de Boleta");
        System.out.println("2.- Reserva de Entradas");
        System.out.println("3.- Modificar Venta");
        System.out.println("4.- Salir");
        System.out.println(" ");
        System.out.println("O--=(____________________(0Y0)_____________________)=--O");
        System.out.println(" ");
        
        do{
          opcion = sc.nextInt();
          if (!(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4)){
              System.out.println("Selecion no valida intentelo de Nuevo");
          }
        }while (!(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4));
        
        switch (opcion){
            
        //Compra De Entradas E Impresion De Boletas   
            
            case 1 -> {
                System.out.println("Has Seleccionado Compra De Entradas");
                System.out.println("Indique su Edad");
                
                while (!sc.hasNextInt()) {
                    System.out.println("Intentelo de Nuevo");
                    sc.next();
                }
                
                edad = sc.nextInt();
                
                teatroMoro.descuento = 0;
                
                if (edad < 0 || edad > 120) {
                    System.out.println("Edad Invalida.");
                } else if (edad >= 13 && edad <= 25) {
                    teatroMoro.descuento = 0.10;
                    System.out.println("Descuento aplicado: Estudiante (10%)");
                } else if (edad >= 60) {
                    teatroMoro.descuento = 0.15;
                    System.out.println("Descuento aplicado: Tercera Edad (15%)");
                } else {
                    System.out.println("Publico general, no se a1plica Descuento.");
                }                                                                       //Breakpoint: Se hace en esa zona para verificar la edad correspondiente y dar su descuento respectivo.
                
                teatroMoro.totalDescuento = (int) (total - (total * teatroMoro.descuento));
                
                System.out.println("--Impresion De Boleta--");
                System.out.println("fila A: " + filaA);
                System.out.println("fila B: " + filaB);
                System.out.println("fila C: " + filaC);
                System.out.println("fila D: " + filaD);
                System.out.println("total: " + total);
                System.out.println("total + descuento :" + teatroMoro.totalDescuento);
                System.out.println(" ");
                System.out.println("O--=(____________________(0Y0)_____________________)=--O");
                System.out.println(" ");
                
                do{
                    
                    final int tiempoLimite=10;
                    System.out.println("Desea Pagar?, responda Si o No");
                    
                    long inicio = System.currentTimeMillis();
                    
                    boolean ingresoFinal = false;
                    
                    while ((System.currentTimeMillis() - inicio)< tiempoLimite*1000){
                        if (System.in.available() >0){
                            pagar= sc.next();
                            ingresoFinal = true;
                            break;
                            
                        }
                        Thread.sleep(100); //Breakpoint: Aqui hubo un bucle infinito y se soluciono con el if del paso 117 utilizando el debug.
                    }
                    if (!ingresoFinal){
                        System.out.println("Tiempo de espera agotado, se cancela la Compra");
                        pagar = "No";
                    }
                    if (pagar.equals("Si".toLowerCase()) || pagar.equals("No".toLowerCase())){
                        if (pagar.equals("Si".toLowerCase())){
                            System.out.print("Procesando Pago");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.println(".");
                            Thread.sleep(1*1000);
                            System.out.println("Pago Exitoso!");
                            total = 0;
                            filaA = 0;
                            filaB = 0;
                            filaC = 0;
                            filaD = 0;
                            pagoPositivo = true;
                        }else {
                            pagoPositivo = true;
                        }
                    }else {
                        System.out.println("Debe Responder Con Si o No");
                        pagoPositivo = false;
                    }
                }while (false!=pagoPositivo); //Breakpoint: Para evitar errores, ya que hacia un falso positivo y se soluciono con un signo de exclamacion.
               
                }
            
        //Reserva De Entradas
            
            case 2 -> {
                do{
                    System.out.println("Has Seleccionado Reserva de Entradas");
                    System.out.println("--= Seleccione fila (letras) y numero de asiento =--");
                    System.out.println("VIP = A");
                    System.out.println("Platea Alta = B");
                    System.out.println("Platea Baja = C");
                    System.out.println("Palco = D");
                    System.out.println(" ");
                    System.out.println("O--=(____________________(0Y0)_____________________)=--O");
                    System.out.println(" ");

                    for (i=0; i<=4; ++i){
                        System.out.print(" [A:  " + teatroMoro.asientos[i] + "]");
                    }
                    System.out.println("");
                    for (i=0; i<=4; ++i){
                        System.out.print(" [B:  " + teatroMoro.asientos[i] + "]");
                    }
                    System.out.println("");
                    for (i=0; i<=4; ++i){
                        System.out.print(" [C:  " + teatroMoro.asientos[i] + "]");
                    }
                    System.out.println("");
                    for (i=0; i<=4; ++i){
                        System.out.print(" [D:  " + teatroMoro.asientos[i] + "]"); 
                    }
                    System.out.println(" ");
                    System.out.println("O--=(____________________(0Y0)_____________________)=--O");
                    System.out.println(" ");
                    do{
                        do{
                            System.out.println("Seleccione Fila");
                            fila = sc.next();
                            if (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila))){
                                System.out.println("Numero invalido, vuelva a Intentarlo");
                            }
                            
                        }while (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila))); //Breakpoint: Aqui es un inicio para ver si hay un error y el de abajo es el final.
                        
                        System.out.println("Seleccione Asiento");
                        
                        while (!sc.hasNextInt()) {
                            System.out.println("Intentelo de Nuevo");
                            sc.next();
                        }
                        butaca = sc.nextInt();
                        
                        if ("a".equals(fila)){
                            filaNumero = 0;
                        }
                        
                        if ("b".equals(fila)){
                            filaNumero = 1;
                        }
                        
                        if ("c".equals(fila)){
                            filaNumero = 2;
                        }
                        
                        if ("d".equals(fila)){
                            filaNumero = 3;
                        }
                        
                        if (butaca>4 || butaca<1){
                            System.out.println("Asiento Invalido, vuelva a Intentarlo");  //Breakpoint: Se verifica la ejecusion de la linea 189 hasta el 216 donde hay una correcta conversion de las letras a numeros.
                        }else {
                            if (butaca>=1){
                                if (teatroMoro.reservas[butaca-1][filaNumero] == 1){
                                    teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]-1);
                                    System.out.println(" ");
                                    System.out.println("O--=(____________________(0Y0)_____________________)=--O");
                                    System.out.println(" ");
                                    System.out.println("Asiento Valido");
                                    
                                    switch (filaNumero){
                                        
                                        case 0 -> {
                                            valorButaca =25000;
                                            filaA = filaA +1;
                                        }
                                        case 1 -> {
                                            valorButaca =20000;
                                            filaB = filaB +1;
                                        }
                                        case 2 -> {
                                            valorButaca =15000;
                                            filaC = filaC +1;
                                        }
                                        case 3 -> {
                                            valorButaca =10000;
                                            filaD = filaD +1;
                                        }
                                    }
                                    
                                    total =(total + valorButaca);
                                    ParametrosEstaticos.valores.totalVentas= ParametrosEstaticos.valores.totalVentas+total;
                                    ParametrosEstaticos.valores.totalVendidas= ParametrosEstaticos.valores.totalVendidas+1;
                                    
                                }else {
                                    System.out.println("Asiento Reservado, Pruebe con Otro");
                                }
                                
                            }
                        }
                    }while (!(butaca == 1 || butaca ==2 || butaca == 3 || butaca == 4));
                    System.out.println("Ha seleccionado " + filaNumero + butaca + " Desea reservar otro Asiento?");
                    do{
                        salir = sc.next();
                        
                        if (salir.toLowerCase().equals("Si")){
                            System.out.println("Ha seleccionado " + salir);
                        } else {
                            if(salir.toLowerCase().equals("No")){
                                System.out.println("Ha seleccionado " + salir);
                            }else {
                                System.out.println("Tiene que responder con Si o No");
                            }
                        }
                    }while (!(salir.toLowerCase().equals("Si") || salir.toLowerCase().equals("No"))); //Breakpoint: Es para evitar errores de mayusculas y minusculas.
                }while (!(salir.toLowerCase().equals("No")));
                } 
            
        //Modificacion de Ventas  
            
            case 3 -> {
                    System.out.println("Has Seleccionado Modificar Venta");
                    do {
                        System.out.println("Seleccione Fila");
                        fila = sc.next();
                        if (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila))){
                            System.out.println("Fila invalida, vuelva a Intentarlo");
                        }
                    }while(!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila)));  //Breakpoint: Se utiliza debug para solucionar error ivertido de las letras de las filas.

                    System.out.println("Seleccione Asientos");
                    while(!sc.hasNextInt()){
                        System.out.println("Seleccion invalida, intentelo de Nuevo");
                        sc.next();
                    }
                    butaca = sc.nextInt();    

                    if ("a".equals(fila)){       //Breakpoint: Se hace en esta zona para validar butaca sin errores.
                        filaNumero = 0;
                        if (teatroMoro.reservas[butaca-1][filaNumero]== 0){
                            teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]+1);
                            ParametrosEstaticos.valores.totalVendidas = ParametrosEstaticos.valores.totalVendidas -1;
                            ParametrosEstaticos.valores.totalDevoluciones = ParametrosEstaticos.valores.totalDevoluciones +1;
                            System.out.print("Procesando Devolucion");
                            filaA = filaA - 1;
                            total = total - 25000;
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.println(".");
                            Thread.sleep(1*1000);
                            System.out.println("Devolucion Exitosa! Hasta Pronto!");

                        }
                    }
                    if ("b".equals(fila)){
                        filaNumero = 1;
                        if (teatroMoro.reservas[butaca-1][filaNumero]== 0){
                            teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]+1);
                            ParametrosEstaticos.valores.totalVendidas = ParametrosEstaticos.valores.totalVendidas -1;
                            ParametrosEstaticos.valores.totalDevoluciones = ParametrosEstaticos.valores.totalDevoluciones +1;
                            System.out.print("Procesando Devolucion");
                            filaB = filaB - 1;
                            total = total - 20000;
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.println(".");
                            Thread.sleep(1*1000);
                            System.out.println("Devolucion Exitosa! Hasta Pronto!");

                        }
                    }
                    if ("c".equals(fila)){
                        filaNumero = 2;
                        if (teatroMoro.reservas[butaca-1][filaNumero]== 0){
                            teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]+1);
                            ParametrosEstaticos.valores.totalVendidas = ParametrosEstaticos.valores.totalVendidas -1;
                            ParametrosEstaticos.valores.totalDevoluciones = ParametrosEstaticos.valores.totalDevoluciones +1;
                            System.out.print("Procesando Devolucion");
                            filaC = filaC - 1;
                            total = total - 15000;
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.println(".");
                            Thread.sleep(1*1000);
                            System.out.println("Devolucion Exitosa! Hasta Pronto!");

                        }
                    }
                    if ("d".equals(fila)){
                        filaNumero = 3;
                        if (teatroMoro.reservas[butaca-1][filaNumero]== 0){
                            teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]+1);
                            ParametrosEstaticos.valores.totalVendidas = ParametrosEstaticos.valores.totalVendidas -1;
                            ParametrosEstaticos.valores.totalDevoluciones = ParametrosEstaticos.valores.totalDevoluciones +1;
                            System.out.print("Procesando Devolucion");
                            filaD = filaD - 1;
                            total = total - 10000;
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.print(".");
                            Thread.sleep(1*1000);
                            System.out.println(".");
                            Thread.sleep(1*1000);
                            System.out.println("Devolucion Exitosa! Hasta Pronto!");

                        }
                    }
                    if(butaca>4 || butaca<1){
                        System.out.println("Asiento invalido, Vuelva a Intentarlo");
                    }
                    System.out.println("Regresando al punto de Ventas");
                    Thread.sleep(3*1000);
                    }
            
        //Salida
            
            case 4 -> System.out.println("Gracias vuelva Pronto!");

            default -> System.out.println("Seleccion no Valida intentelo de Nuevo");     
        }
                    
    }while (opcion !=4); 
        
    }
    
}
