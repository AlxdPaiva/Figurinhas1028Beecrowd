/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurinhas1028beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Figurinhas1028Beecrowd {
    
    public static int calcularMDC(int F1, int F2) {
        while (F2 != 0) {
            int temp = F2;
            F2 = F1 % F2;
            F1 = temp;
        }
        return F1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int F1 = 0;
        int F2 = 0;
        
        for (int cont = 0; cont < N; cont++) {
            F1 = teclado.nextInt();
            F2 = teclado.nextInt();
            int resultado = calcularMDC(F1, F2);
            System.out.println(resultado);
        }   
               
    }

}
