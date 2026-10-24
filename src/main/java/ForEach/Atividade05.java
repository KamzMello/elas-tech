package ForEach;

public class Atividade05 {
    public static void main(String[] args) {

       // Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        //usando o índice. Deixe os dois na mesma classe e compare.

        String [] nomes = { "Ana", "Fernanda", "Antonio", "Carlos"};

        // EXERCÍCIO 1) FOR EACH :
        for ( String nome : nomes) {
            System.out.println(nome);
}
        // EXERCÍCIO 5) FOR NORMAL :
        for (int i =0; i<nomes.length; i++) {
            System.out.println(nomes[i]);

        }


    }
}