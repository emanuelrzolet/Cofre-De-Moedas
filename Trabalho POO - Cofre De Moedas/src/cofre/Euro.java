package cofre;

public class Euro extends Moeda{

      public Euro(double valor, String tipo) {
    super(valor,tipo);
  }

      //Métodos
      @Override
      public void converter() {
        valor *= 5.5;
      }

}
