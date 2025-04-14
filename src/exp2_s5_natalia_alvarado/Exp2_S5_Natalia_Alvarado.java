
package exp2_s5_natalia_alvarado;

import java.util.Scanner;

public class Exp2_S5_Natalia_Alvarado {

    public static void main(String[] args) throws InterruptedException {
        
       Scanner sc = new Scanner(System.in);
       
       VariablesInstancia teatroMoro = new VariablesInstancia();
       
    /// Variables Locales 
    
    int i;
    int z;
    int butaca;
    int edad;
    int filaA = 0;
    int filaB = 0;
    int filaC = 0;
    int filaD = 0;
    int filaNumero = 0;
    int total = 0;
    int valorButaca = 0;
    boolean pagoPositivo;
    boolean seguirComprando = false;
    String comprarMas;
    String confirmar;
    String confirmarPromo;
    String fila;
    String opcion = null;
    String pagar;
    String salir;
    
    // Entrada de Datos
    
    // Proceso
    
    do{
        do{

                OUTER:
                for (z=0; z<5; z++) {
                    System.out.println("Bienvenido Al Teatro Moro!");
                    System.out.println("Menu Principal");
                    System.out.println("1.- Quiero comprar una entrada");
                    System.out.println("2.- Sistema de Devoluciones");
                    System.out.println("3.- Salir");
                    System.out.println("Seleccione 1 si quiere comprar o seleccione 2 si desea salir");
                    System.out.println(" ");
                    System.out.println("O--=(___________________________________________)=--O");
                    System.out.println(" ");
                    opcion = sc.next();
                    if ("3".equals(opcion)) {
                        System.out.println("Saliendo del programa...");
                        System.out.println("Muchas Gracias por preferir Teatro Moro, hasta pronto!");

                        } else 
                            if ("1".equals(opcion)) {
                                System.out.println("Has seleccionado Comprar entrada");
                            break;
                        } else {
                            if ("2".equals(opcion)) {
                                System.out.println("Has seleccionado Sistema de Devoluciones"); 
                            break;
                            }
                        }

                    System.out.println("Opcion no valida. Intente nuevamente.");
                    }
            }while (!("1".equals(opcion) || "2".equals(opcion)));

          //Proceso de Devolucion de Entradas  

          if("2".equals(opcion)){
           do {
              System.out.println("Seleccione Fila");
              fila = sc.next();
              if (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila))){
                  System.out.println("Fila invalida, vuelva a intentarlo");
              }
            }while(!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila)));  

            System.out.println("Seleccione Asientos");
            butaca = sc.nextInt();

            if ("a".equals(fila)){
                filaNumero = 0;
                if (teatroMoro.reservas[butaca-1][filaNumero]== 0){
                    teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]+1);
                    VariablesEstaticas.valores.totalVendidas = VariablesEstaticas.valores.totalVendidas -1;
                    VariablesEstaticas.valores.totalDevoluciones = VariablesEstaticas.valores.totalDevoluciones +1;
                    System.out.print("Procesando Devolucion");
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
                    VariablesEstaticas.valores.totalVendidas = VariablesEstaticas.valores.totalVendidas -1;
                    VariablesEstaticas.valores.totalDevoluciones = VariablesEstaticas.valores.totalDevoluciones +1;
                    System.out.print("Procesando Devolucion");
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
                    VariablesEstaticas.valores.totalVendidas = VariablesEstaticas.valores.totalVendidas -1;
                    VariablesEstaticas.valores.totalDevoluciones = VariablesEstaticas.valores.totalDevoluciones +1;
                    System.out.print("Procesando Devolucion");
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
                    VariablesEstaticas.valores.totalVendidas = VariablesEstaticas.valores.totalVendidas -1;
                    VariablesEstaticas.valores.totalDevoluciones = VariablesEstaticas.valores.totalDevoluciones +1;
                    System.out.print("Procesando Devolucion");
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


            if(butaca>5 || butaca<1){
                System.out.println("Asiento invalido, Vuelva a Intentarlo");
            }
              System.out.println("Regresando al punto de Ventas");
              Thread.sleep(3*1000);
          }

            if("1".equals(opcion));
            System.out.println("Escriba su nombre");
            teatroMoro.nombre = sc.next();
            
            System.out.println(" ");
            System.out.println("O--=(___________________________________________)=--O");
            System.out.println(" ");
            System.out.println("Valores de Entrada");
            System.out.println("Vip: 25000");
            System.out.println("Platea Alta: 20000");
            System.out.println("Platea Baja: 15000");
            System.out.println("Palco: 10000");
            System.out.println(" ");
            System.out.println("O--=(___________________________________________)=--O");
            System.out.println(" ");

            do{

            System.out.println("--= Seleccione fila (letras) y numero de asiento =--");
                    System.out.println("VIP = A");
                    System.out.println("Platea Alta = B");
                    System.out.println("Platea Baja = C");
                    System.out.println("palco = D");
                    System.out.println(" ");
                    System.out.println("O--=(___________________________________________)=--O");
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
                    System.out.println("O--=(___________________________________________)=--O");
                    System.out.println(" ");
                    
                do{
                    do{
                        System.out.println("Seleccione Fila");
                        fila = sc.next();
                        if (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila))){
                            System.out.println("Numero invalido, vuelva a intentarlo");
                        }

                }while (!("a".equals(fila) || "b".equals(fila) || "c".equals(fila) || "d".equals(fila)));

                    System.out.println("Seleccione Asiento");
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

                    if (butaca>5 || butaca<1){
                        System.out.println("Asiento Invalido, vuelva a intentarlo");
                    }else {
                        if (butaca>=1){
                            if (teatroMoro.reservas[butaca-1][filaNumero] == 1){
                                teatroMoro.reservas[butaca-1][filaNumero] = (teatroMoro.reservas[butaca-1][filaNumero]-1);
                                System.out.println(" ");
                                System.out.println("O--=(___________________________________________)=--O");
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
                                VariablesEstaticas.valores.totalVentas= VariablesEstaticas.valores.totalVentas+total;
                                VariablesEstaticas.valores.totalVendidas= VariablesEstaticas.valores.totalVendidas+1;

                                }else {
                                System.out.println("Asiento Reservado, Pruebe con otro");
                            }

                            }
                        }

                        if (butaca% 2 == 0){
                            System.out.println("Tu Asiento es Par");
                        }else {
                            System.out.println("Tu Asiento es Impar");
                        }

                    }while (!(butaca== 0 || butaca== 1 || butaca==2 || butaca==3 || butaca==4 || butaca==5 || butaca==6 || butaca==7 || butaca==8 || butaca==9 || butaca==10 || butaca==11 || butaca==12 || butaca==13 || butaca==14 || butaca==15 || butaca==16 || butaca==17 || butaca==18 || 19==butaca));

                    System.out.println( "Ha seleccionado " + fila + teatroMoro.asientos [butaca-1] + " Desea Agregar Otro Asiento");

                    do {
                        salir= sc.next();
                        if (salir.toLowerCase().equals("si") || salir.toLowerCase().equals("no")){
                            System.out.println("Ha seleccionado " + salir);
                        }else {
                            System.out.println("Responda con si o no");
                        }
                    }while (!(salir.toLowerCase().equals("si") || salir.toLowerCase().equals("no")));

            }while (!salir.toLowerCase().equals("no"));

             //Proceso de Promoción
             
                    System.out.println(" ");
                    System.out.println("O--=(___________________________________________)=--O");
                    System.out.println(" ");
                    System.out.println("Promocion!!!");
                    System.out.println("total a pagar: " + total);     
                    System.out.println("Solo por hoy Lunes hay un descuento del 50% en cualquier compra de entradas, desea activar la promocion?");
                    System.out.println(" ");
                    System.out.println("O--=(___________________________________________)=--O");
                    System.out.println(" ");    
                        confirmarPromo = sc.next();
                    do{
                        if ("si".toLowerCase().equals(confirmarPromo)){
                            System.out.println("El descuento se ha aplicado exitosamente");
                            total = total / 2;
                        }else if ("no".toLowerCase().equals(confirmarPromo)){
                            System.out.println("No se aplico la Promocion");
                        }else
                            System.out.println("tiene que responder con si o con no");
                    }while (!("si".toLowerCase().equals(confirmarPromo) || "no".toLowerCase().equals(confirmarPromo))); 
            
                    System.out.println(" ");
                    System.out.println("O--=(___________________________________________)=--O");
                    System.out.println(" ");
                    System.out.print("Ingrese su edad: ");
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
                        }

                    teatroMoro.totalDescuento = (int) (total - (total * teatroMoro.descuento));  

            //Salida y Revision De Ventas

            System.out.println("fila A: " + filaA);
            System.out.println("fila B: " + filaB);
            System.out.println("fila C: " + filaC);
            System.out.println("fila D: " + filaD);
            System.out.println("Total: " + total);
            System.out.println("total + descuento :" + teatroMoro.totalDescuento);
            System.out.println(" ");
            System.out.println("O--=(___________________________________________)=--O");
            System.out.println(" ");
            System.out.println("Desea Pagar?, responda si o no");

            do{
               pagar= sc.next();
               if (pagar.equals("si".toLowerCase()) || pagar.equals("no".toLowerCase())){
                   if (pagar.equals("si".toLowerCase())){
                       System.out.print("Procesando Pago");
                       Thread.sleep(1*1000);
                       System.out.print(".");
                       Thread.sleep(1*1000);
                       System.out.print(".");
                       Thread.sleep(1*1000);
                       System.out.println(".");
                       Thread.sleep(1*1000);
                       System.out.println("Pago Exitoso!");
                       pagoPositivo = true;
                   }else {
                       pagoPositivo = true;
                   }
               }else {
                   System.out.println("Debe Responder Con Si o No");
                   pagoPositivo = false;           
               }
            }while (true!=pagoPositivo);
            
            seguirComprando = true;
            boolean textoCorrecto = false;
            do{
                System.out.println("Desea Regresar al Mmenu Principal?");
                System.out.println(" ");
                System.out.println("O--=(___________________________________________)=--O");
                System.out.println(" ");
                comprarMas = sc.next();
                if(comprarMas.equals("si".toLowerCase())|| comprarMas.equals("no".toLowerCase())){
                   textoCorrecto = true;
                   
                   if(comprarMas.equals("no".toLowerCase())){
                       seguirComprando = false;
                       System.out.println("Gracias Por su Visita, Vuelva Pronto!");
                   }
                }else{
                    System.out.println("Debe Responder con Si o No");
                    textoCorrecto = false;
                }
            }while(textoCorrecto == false);
            
            System.out.println(" ");
            System.out.println("O--=(___________________________________________)=--O");
            System.out.println(" ");
            System.out.println("Desea Ingresar al sistema de revision de Ventas?");

            confirmar = sc.next();

            if(confirmar.equals("si".toLowerCase()) || confirmar.equals("no".toLowerCase())){
                if(confirmar.equals("si".toLowerCase())){
                    System.out.println("Total de Entradas del Dia: ");
                    System.out.println(" ");
                    System.out.println("Total de Entradas Vendidas" + VariablesEstaticas.valores.totalVendidas);
                    System.out.println("Total de Ganancias" + VariablesEstaticas.valores.totalVentas);
                    System.out.println("Total de Devoluciones" + VariablesEstaticas.valores.totalDevoluciones);
                    System.out.println("Gracias vuelva Pronto!");
                }
                if(confirmar.equals("no".toLowerCase())){
                    System.out.println("Gracias Vuelva Pronto");
                }
            }else{
                System.out.println("Responda con si o no");
            }
        
    }while(seguirComprando == true);
              
    }
                    
}
    