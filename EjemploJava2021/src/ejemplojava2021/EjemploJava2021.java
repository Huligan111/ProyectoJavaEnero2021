/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava2021;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class EjemploJava2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char opcion;
        Scanner in = new Scanner (System.in);
        do {
            System.out.println("Puedes escoger entre opcion a, b, c  o d para salir");
            opcion = in.next().charAt(0);
            switch (opcion){
                case 'a':System.out.println("Escogiste opcion A");break;
                case'b':System.out.println("Escogiste opcion B");break;
                case 'c':System.out.println("Escogiste opcion C");break;
                case 'd':System.out.println("Adios");break;
                default:break;
            }

        }while (opcion != 'd'); // Sigue dando vueltas hasta que le ponemos "d" entonces sale si no no para
    }
    
}
