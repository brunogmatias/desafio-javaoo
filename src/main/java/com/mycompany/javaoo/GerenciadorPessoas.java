/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoo;

/**
 *
 * @author bruno
 */

//classe "Regra de Negócios"
public class GerenciadorPessoas {
    private Pessoa pessoasLista[];
    private int contador;

    public GerenciadorPessoas() {
        this.pessoasLista = new Pessoa[100];
        this.contador = 0;
    }
    
    public void cadastrarPessoas(String nome, String funcao, int codigo){
        //verifica se já existe um código cadastrado.
        if(localizarPessoaCodigo(codigo) != null){
            System.out.println("Error: pessoa já cadastrada.");    
        //verifica se ainda há espaço no array através da var <contador>, se houver, adiciona mais um obejto 'Pessoa' no array [pessoasLista].
        }else if(contador < pessoasLista.length){
            pessoasLista[contador] = new Pessoa(nome, funcao, codigo);
            contador++;
            System.out.println("Pessoa cadastrada com sucesso!");
        }else{
            System.out.println("Limite de cadastro atingido.");
        }
    }
    
    public void listarPessoas(){
        boolean temPessoa = false;
        for(int i = 0 ; i < contador ; i++){
            if(pessoasLista[i] != null){
                System.out.println(pessoasLista[i]);
                temPessoa = true;
                break;
            }           
        }    
        if(temPessoa != true){
                System.out.println("Nenhuma pessoa cadastrada");
            }
    }
    
    public Pessoa localizarPessoaCodigo(int codigo){
        for(int i = 0 ; i <= contador ; i++){  
            if(pessoasLista[i] != null && pessoasLista[i].getCodigo() == codigo){
                System.out.println(pessoasLista[i]);
                return pessoasLista[i]; //verificar se há alguém cadastrado através do contador, caso o código seja igual, retorna as informações da pessoa cadastrada.
            }
        }
        System.out.println("Não há pessoa cadastrada com esse código.");
        return null;
    }
    //remove da array os códigos informados
    public void removerPessoaCodigo(int codigo){
        boolean pessoaRemovida = false;
        for(int i = 0 ; i<= contador ; i++){
            if(pessoasLista[i] != null && pessoasLista[i].getCodigo()==codigo){
                contador--;
                pessoasLista[i] = null;
                System.out.println("Pessoa removida com sucesso.");
                pessoaRemovida = true;
                break;
            }
        }     
            if(pessoaRemovida != true) {
            System.out.println("Código informado não existe.");
        }
        
        
    }
}
