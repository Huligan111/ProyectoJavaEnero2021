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
         int opcion = 0;
        Scanner in = new Scanner (System.in);
        do {
            System.out.println("Puedes escoger entre opcion 1, 2, 3  o 4 para salir");
            opcion = in.nextInt();
            switch (opcion){
                case 1:System.out.println("Escogiste opcion 1");break;
                case 2:System.out.println("Escogiste opcion 2");break;
                case 3:System.out.println("Escogiste opcion 3");break;
                case 4:System.out.println("Adios");break;
                default:break;
            }

        }while (opcion != 4); // Sigue dando vueltas hasta que le ponemos 4 entonces sale si no no para
    }
    
}
