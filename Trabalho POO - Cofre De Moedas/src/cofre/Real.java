package cofre;

public class Real extends Moeda{



      public Real(double valor, String tipo) {
    super(valor, tipo);
  }

      //Métodos
      @Override
      public void converter() {
        System.out.println("O valor já está em real!");
      }

}
