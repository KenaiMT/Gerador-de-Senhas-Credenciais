package view;

import business.GeradorPin;
import business.GeradorSenha;
import business.GeradorSenhaForte;

public class Principal {

    public static void main(String[] args) {

        GeradorSenha gerador;

        gerador = new GeradorSenhaForte(12);

        System.out.println("Senha segura gerada:");
        System.out.println(gerador.gerarSenha());

        gerador = new GeradorPin();
        
        System.out.println("\nPIN gerado:");
        System.out.println(gerador.gerarSenha());
    }
}