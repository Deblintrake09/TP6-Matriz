/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.matriz;

/**
 *
 * @author jackd
 */
public class TP6Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matriz m1=new Matriz();
        int[][] matriz1={{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        m1.armar(matriz1);
        
        System.out.println("");
        m1.visualizarPares(matriz1);
      
        System.out.println("");
        m1.visualizar(matriz1);
    }
    
}
