/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author TIMO
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingresar las notas del estudiante
        String nota1;
        String nota2;
        String nota3;
        double promedio;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextLine();
        
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextLine();
        
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextLine();
        
        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);
        
        promedio = (n1+n2+n3)/3;
        
        String resultado = promedio>=14 ? "Aprobó el año" : "Reprobó el año";
        
        System.out.printf("El Estudiante %S con un promedio de: %S", resultado
                , promedio);
        
    }
    
}
