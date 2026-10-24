// B)   Crie Carro= CLASSE 1 + IMPLEMENTS


package AtividadeInterfaces02;

   public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado!");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }



}