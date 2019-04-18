/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author TIMO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x;
        String y;
        String z;
        double numerador;
        double denominador;
        double m;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la variable X");
        x = entrada.nextLine();
        System.out.println("Ingrese el valor de la variable Y");
        y = entrada.nextLine();
        System.out.println("Ingrese el valor de la variable Z");
        z = entrada.nextLine();
        
        numerador =  Double.parseDouble(x) + ( Double.parseDouble(y) / 
                Double.parseDouble(z) );
        denominador = Double.parseDouble(x) - ( Double.parseDouble(y) / 
                Double.parseDouble(z) );
        
        m = numerador / denominador;
        
        System.out.printf("el valor de m, en base a las variables:\nX=%S\n Y=%S"
                + "\n  Z=%S\n da como resultado m: %S", x, y, z ,m );
        
        
    }
    
}
