package DesafiosExtra;

import java.util.Scanner;

public class PoQueMao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evolucoes = 0;
        int numeroDoces = 0;

        System.out.println("Entre com o numero de doces disponiveis: ");
        numeroDoces = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numero de doces necessarios para a evolucao: ");
        int primeiraEvolucao = scanner.nextInt();

        System.out.println("Digite o numero de doces necessarios para a evolucao: ");
        int segundaEvolucao = scanner.nextInt();

        System.out.println("Digite o numero de doces necessarios para a evolucao: ");
        int terceiraEvolucao = scanner.nextInt();

        if(numeroDoces >= primeiraEvolucao + segundaEvolucao + terceiraEvolucao){
            evolucoes = 3;
        }
        else if(numeroDoces >= primeiraEvolucao + segundaEvolucao || numeroDoces >= primeiraEvolucao + terceiraEvolucao || numeroDoces >= segundaEvolucao + terceiraEvolucao){
            evolucoes = 2;
        }
        else {
            evolucoes = 1;
        }

        System.out.println(evolucoes);
    }
}
