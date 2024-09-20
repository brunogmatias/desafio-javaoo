/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoo;

/**
 *
 * @author bruno
 */

//salvando em outro branch.
public class Pessoa {
    String nome;
    String funcao;
    int codigo;

    public Pessoa(String nome, String funcao, int codigo) {
        this.nome = nome;
        this.funcao = funcao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Lista: " + "\nNome: " + nome + "\nFunção: " + funcao + "\nCodigo: " + codigo + ' ';
    }
    
    
}
