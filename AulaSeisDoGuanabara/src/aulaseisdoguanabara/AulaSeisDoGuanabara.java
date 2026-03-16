/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaseisdoguanabara;

import java.util.Scanner;

/**
 *
 * @author KilderyMD
 */
public class AulaSeisDoGuanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o sobrenome do aluno: ");
        String Sobrenome = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        float maisdez = 10;
        float resultadomaisdez = nota + maisdez;
        float divididopordois = resultadomaisdez / 2;
        
                System.out.printf("Seu nome é: %s \n", nome);
                System.out.printf("Seu sobrenome é %s \n", Sobrenome);
                System.out.printf("Seu nome completo é %s %s \n", nome, Sobrenome);
                System.out.printf("A nota de %s %s é: %.1f \n", nome, Sobrenome, nota);
                System.out.printf("E sua nota + 10 é: %.1f \n", resultadomaisdez);
                System.out.println("E o seu resultado + 10 dividido por 2 fica: " + divididopordois); 
    }
    
    // public static void (String[] args) {
    //    String Sobrenome = "Guanabara";
      //  char sobrenome = "Guanabara";
        //    System.out.println("Seu sobrenome é: %s", sobrenome);
        
    }
    
