/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facul;

/**
 *
 * @author Luiz.albino
 */
public class duracoes {
    public static void main (String args[]){
	int cont, soma = 0;
	int duracoes [] = {65, 87, 72, 75};
	for (cont = 0; cont < duracoes.length; cont++)
            soma = soma + duracoes[cont];
            System.out.print("A média de "+duracoes.length);
            System.out.println("duracoes é "+ (soma/duracoes.length));
    }
}