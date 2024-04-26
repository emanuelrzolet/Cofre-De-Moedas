package cofre;

import java.util.ArrayList;

public class Cofrinho {
    double total;

    //Lista conterá todas as moedas cadastradas
    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    //Métodos
    //Método testa se a lista está vazia
    public boolean checarTamanho(){
        return listaMoedas.isEmpty();
    }
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
            //Caso nao for real a moeda será convertida.
            if (!"Real".equals(moeda.tipo)){
                moeda.converter();
                moeda.tipo = "Real";
            }
            total += moeda.valor;
            
            
        }
        System.out.printf("O total convertido para Real é: R$ %.2f\n", total);
        
    }


    


}
