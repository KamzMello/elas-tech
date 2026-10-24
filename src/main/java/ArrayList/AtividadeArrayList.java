package ArrayList;
// 1) Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

import java.util.ArrayList;

public class AtividadeArrayList {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add ( " Fernando");
        nomes.add ("Marcio");
        nomes.add("Cássio");


        System.out.println(nomes);


    }
}
