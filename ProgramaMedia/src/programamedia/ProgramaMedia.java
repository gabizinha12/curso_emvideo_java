/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Gabizinha
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Primeira nota ");
        float n1 = entrada.nextFloat();
        System.out.print("Segunda nota ");
        float n2 = entrada.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if(m > 9) {
            System.out.println("Parabens!");
        } 
    }
    
}
