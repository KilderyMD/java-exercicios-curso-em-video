/*
*   EXERCÍCIO JAVA 14/01/26
*  author: KilderyMD
 */
package Main;

import java.util.Scanner;

    public class Main{
        
        public static void main(String [] args) {
            
            Scanner sc = new Scanner (System.in);
            
            String fruta;
            int quantidadeFruta;
            double precoFruta = 1.20;
            double valorFinalFruta;
            
            System.out.println("Digite qual fruta você quer: ");
            fruta = sc.nextLine();
            
            System.out.println("Digite agora a quantidade de frutas que você quer: ");
            quantidadeFruta = sc.nextInt();
            
            valorFinalFruta = quantidadeFruta * precoFruta;
            
            System.out.println("A fruta que você quer é: " + fruta);
            System.out.printf("A quantidade de %s que você quer é: %d \n", fruta, quantidadeFruta);
            System.out.println("O preço disso vai ficar em: " + valorFinalFruta);
        }
    }