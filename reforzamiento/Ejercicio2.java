package reforzamiento;

import java.util.Scanner;

/**
 * InnerEjercicio2
 */
public class Ejercicio2 {
    public static void saludoSegundoHora() {
        //variables
        int hora;
        String saludo;   
        Scanner leerT=new Scanner(System.in);
        //datos de entrada
        System.out.println("ingrese la hora:");
        hora=leerT.nextInt();
        //proceso
        if(hora >=6 && hora <=12) {
            saludo="Buenos Dias";
        
        }else if(hora>=13 && hora <= 20) {
            saludo="Buenas Tardes";

        } else if ((hora>=21 && hora <= 23) || (hora >=0 && hora <=5)) {
            saludo="Buenas Noches";
        }else {
            saludo="esa hora no existe";

        }
        //Datos de Salida
        System.out.println(saludo);


        
    }

    public static void main(String[] args) {
    saludoSegundoHora();
    }
}