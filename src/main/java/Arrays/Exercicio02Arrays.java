package Arrays;
// 2 — Crie um array com as notas {8, 6, 10, 7, 9}.
// Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
public class Exercicio02Arrays {
    public static void main(String[] args) {

        int [] notas =  {8, 6, 10, 7, 9};
         for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i + 1) + ": " + notas[i]);

        }


    }
}



