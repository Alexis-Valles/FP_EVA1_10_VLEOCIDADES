/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_velocidad;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_VELOCIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vo, a, t, d;
        Scanner captu = new Scanner(System.in);
        
        
        System.out.println("Velocidad inicial: ");
        vo = captu.nextDouble();
        System.out.println("Tiempo: ");
        t = captu.nextDouble();
        System.out.println("Aceleracion: ");
        a = captu.nextDouble();
        d = vo * t + (a * t * t) / 2;
        System.out.println("Distancia = " + d);
        
    }
    
}
