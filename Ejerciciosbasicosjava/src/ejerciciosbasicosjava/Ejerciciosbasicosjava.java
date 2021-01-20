/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Rodion
 */
public class Ejerciciosbasicosjava {
    
    public boolean fiestaArdillas (int numbellotas, boolean findesemana){
      //Si es fin de semana da igual las bellotas que haya.
      if(findesemana){
          return true;
      }
      //Si llega aqui no es fin de semana.
      if(numbellotas >= 40 && numbellotas <= 60){
          return true;
      }
          return false;
    }
    
    //Multa.
    public int multa(int velocidad, boolean birthday){
        if(birthday){
            velocidad = velocidad -5;//velocidad-=5
        }
        if(velocidad <= 60){
         return 0;   
        }
        //Si va entre 61 y 80:
        if(velocidad > 60 && velocidad<= 80){
            return 1;
        }
        return 2;
    }
    public boolean muyvanidoso(int numero){
        if(numero % 11 < 2){//Si la division da 0 o 1
            return true;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un objeto de la clase en la que estamos(Ejerciciosbasicosjava).
        Ejerciciosbasicosjava ejercicio = new Ejerciciosbasicosjava();
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        //Multa.
        System.out.println("Ejercicio 02 multa:");
        System.out.println(ejercicio.multa(60,false));
        System.out.println(ejercicio.multa(65, false));
        System.err.println(ejercicio.multa(65, true));
        //Muy vanidoso
        System.out.println("Ejercicio 03 muy vanidoso:");
        System.out.println(ejercicio.muyvanidoso(22));
        System.out.println(ejercicio.muyvanidoso(23));
        System.out.println(ejercicio.muyvanidoso(24));
    }
    
}
