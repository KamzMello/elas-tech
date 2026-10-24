// Exerc. 1 - Etapa 3) MAIN = PONTO DE PARTIDA> ENTRADA.
//  Exerc. 2 - Etapa 3 )Na main, declare as duas variáveis como Animal:
// Animal bidu = new Cachorro();
// Animal salem= new Gato();
//  Chame emitirSom() nas duas.

// 3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
//   e percorra com for-each chamando emitirSom(). Repare que não
//   tem nenhum if. Dica:
//animais.add(new Cachorro()); - NA MAIN


package AtividadeInterfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }


    }

}