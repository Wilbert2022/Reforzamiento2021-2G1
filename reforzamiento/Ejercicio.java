package reforzamiento;

import java.util.Scanner;

/**
 * Ejercicio
 */
public class Ejercicio {
    public static void MostrarCursoDia() {
        //Definir Variable
        int diaSem;
        String mensaje;
        //Leer Datos
        Scanner leerT=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana:\n1=Dom\n2=Lun\n3=mar\n4=mier\n5=jue\n6=vier\n7=sab");
        diaSem=leerT.nextInt();
        //Proceso
        if(diaSem==1 || diaSem==7) {
            mensaje="no hay clases";
        }else if (diaSem==2) {
            mensaje="Matematica";
        }else if (diaSem==3|| diaSem==5) {
            mensaje="Fundamentos de Programacion";
        }else if (diaSem==4) {
            mensaje="Capacidades Comunicativas"; 
        }else if (diaSem==5) {
            mensaje="Fundamentos de Programacion";
        }else if (diaSem==6) {
            mensaje="Introduccion a la Ingenieria de Sistemas";
        }else{
            mensaje="el dia que coloco no existe";
        }

        //datos de salida
        System.out.println("Ese dia toca el curso de:"+mensaje);

    }


    public static void main(String[] args) {
    //System.out.println("hola");//
    MostrarCursoDia();

}
    
}