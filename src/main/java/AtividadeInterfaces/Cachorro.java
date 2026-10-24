// Crie a classe Cachorro que implementa ela e imprime "Au au!".

// ETAPA 2 ) CRIAS A CLASSE E SUA MSG


package AtividadeInterfaces;

public class Cachorro implements  Animal {

    @Override
    public void emitirSom() {
        System.out.println(" Au au !");
    }
}
