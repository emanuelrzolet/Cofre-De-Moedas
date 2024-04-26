package cofre;

import java.util.ArrayList;

public class Cofrinho {
    double total;

    //Lista conterá todas as moedas cadastradas
    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    //Métodos
    public void adicionar (Moeda moeda){
        listaMoedas.add(moeda);
    }
    
    public void listarMoedas(){

        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.printf("[%d] - Tipo: %s, Valor: %2f%n", i, listaMoedas.get(i).tipo, listaMoedas.get(i).valor);
        }
    }
    public void remover(int moeda){
        listaMoedas.remove(moeda);
    }

    public void totalConvertido(){
        for (Moeda moeda : listaMoedas){
            moeda.converter();
            total += moeda.valor;
            
        }
        System.out.printf("O total convertido para Real é: R$ %.2f\n", total);
        
    }


    


}
