/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Gabizinha
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        int numero = 5;
        int valor = 5 + ++numero; // pre incremento o numero ja vale 6 por isso dá 11
        System.out.println(valor);
        System.out.println(numero);
        
        int x = 4;
        x += 2;
        System.out.println(x);
          
        
        float v = 8.9f;
        int ar  = (int) Math.floor(v);
        System.out.println(ar);
    }
    
}
