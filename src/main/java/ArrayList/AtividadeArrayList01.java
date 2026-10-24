/*

package ArrayList;

import java.util.ArrayList;

// - Crie uma lista já preenchida com quatro frutas.
// Imprima a primeira, a última e quantas frutas tem.
public class AtividadeArrayList01 {

    public void main(String[] args) {

        ArrayList <String> frutas =  new ArrayList<>();

        frutas.add (" Melão");
        frutas.add (" Banana");
        frutas.add (" Laranja");
        frutas.add (" Uva");

        System.out.println(" Primeira fruta: " + frutas.get(0)); // primeira fruta
        System.out.println(" Última fruta : "+ frutas.get (3)); // última fruta
        System.out.println( " Total de frutas: " + frutas.size());

    }
} */



package ArrayList;

import java.util.ArrayList;

//  03 - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e
//imprima a lista antes e depois.

public class AtividadeArrayList01 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Anderson");
        nomes.add("Maura");
        nomes.add(" Luiz");
        nomes.add(" Felipe");

        System.out.println("Antes:" + nomes );

        nomes.set (1, "Renata");
        System.out.println( " Depois:" + nomes);
    }
}

