package Ejercicio1;

public class Tema1{

    public static void main(String[] args) {

        String nombre= "Jose";
        int edad= 66;
        double altura= 1.55d;
        long distancia= 320;
        boolean aceptado;
        aceptado=true;


        System.out.println(nombre+ " "+ edad+" años"+" "+altura+" cm"+" "+distancia+" kilometros");


        if(edad>18){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad.");
        }
        if (aceptado=true) {
            System.out.println("El usuario ha sido aceptado.");
        }


    }
}
