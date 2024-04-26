package cofre;

public abstract class Moeda {

    protected double valor;
    

    //Métodos

    public void info(){
        System.out.println("O valor da moeda é: " + valor);
    };


    //O método é sobreposto nas classes filhas com suas particularidades
    public void converter(){
        System.out.println("Convertendo os valores para R$...");
    };

}
