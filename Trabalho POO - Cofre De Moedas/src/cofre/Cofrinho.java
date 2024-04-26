package cofre;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    //Lista conterá todas as moedas cadastradas
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    //Métodos
    public void adicionar (Moeda moeda){
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda){
        Scanner tScanner = new Scanner(System.in);
        for (int i = 0; i < listaMoedas.size(); i++){
            System.out.println(listaMoedas.get(i));
        }
        listaMoedas.remove(0);
    }


}
