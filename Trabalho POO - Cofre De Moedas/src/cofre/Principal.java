package cofre;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Criação do Scanner
        Scanner tScanner = new Scanner(System.in);

        //Inicio da Execução
        System.out.println("-_- Gerenciador de Moedas -_-");
        int escolha = tScanner.nextInt();
        while (escolha != 0) {
            System.out.println("Cofrinho Pessoal");
            System.out.println("Digite 0 para sair:");
        }

        tScanner.close();
    }

}
