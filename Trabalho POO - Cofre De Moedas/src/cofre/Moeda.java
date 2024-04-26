package cofre;

public abstract class Moeda {
    
    protected double valor;
    protected String tipo;

    /**
     * @param valor
     * @param tipo
     */
    public Moeda(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    
    


    

    //Métodos

    public void info(){
        System.out.println("O valor da moeda é: " + valor);
        System.out.println("O tipo da moeda é: " + tipo);
    };


    //O método é sobreposto nas classes filhas com suas particularidades
    public void converter(){
        System.out.println("Convertendo os valores para R$...");
    };

}
