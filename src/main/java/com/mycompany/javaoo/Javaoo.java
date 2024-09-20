/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaoo;

import java.util.Scanner;

/**
 *
 * @author bruno
 */

//classe principal
public class Javaoo {
    
    public static void main(String[] args) {
        //criado scanner entrada para leitura de dados.
        Scanner entrada = new Scanner(System.in);
        //criado o objeto gerenciador para usar os métodos da clase 'GerenciadorPessoas(Regra de Negócios)'.
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();
        int op = 0;
        
        while(op != 5){           
            switch(op){
                 case 1:
                     System.out.println("Pessoas cadastradas: ");
                     gerenciador.listarPessoas();
               break;
               
                 case 2:
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = entrada.nextLine();
                    System.out.println("Digite a função da pessoa: ");
                    String funcao = entrada.nextLine();
                    System.out.println("Digite o código da pessoa: ");
                    int codigo = entrada.nextInt();
                    
                    gerenciador.cadastrarPessoas(nome, funcao, codigo);
                break;
                
                 case 3:
                     System.out.println("Digite o código da pessoa que você quer encontrar: ");
                     int codE = entrada.nextInt();
                     
                     gerenciador.localizarPessoaCodigo(codE);
                break;
                
                 case 4:
                     System.out.println("Digite o código da pessoa que você quer remover: ");
                     int codR = entrada.nextInt();
                     
                     
                 break;
            }      
        }
    }
}
