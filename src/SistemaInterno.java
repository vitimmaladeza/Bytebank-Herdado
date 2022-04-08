public class SistemaInterno {

    private int senha = 333;

    public void autentica(Autenticavel fa){
      boolean autenticou = fa.autentica(this.senha);
      if(autenticou){
          System.out.println("Pode entrar no Sistema! ");
      } else {
          System.out.println("Nao pode entrar! ");
          System.out.println("seu babaca");
      }
    }
}
