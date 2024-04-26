package cofre;

public class Dolar extends Moeda{
    


    public Dolar(double valor, String tipo) {
        super(valor, tipo);
    }

    //Métodos
    @Override
    public void converter() {
        valor *= 5.1;
    }



}
