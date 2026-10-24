package ForEach;

public class Atividade01 {

    public static void main(String[] args) {

         // 1. Crie um array (não arrayList, array normal)
        // com 4 nomes e imprima todos usando for-each,
        //   um por linha.

        String [] nomes = { " Ana", " Fernanda", " Antonio", " Carlos"};

        for ( String nome : nomes) {
            System.out.println(nome);
        }


    }
}
