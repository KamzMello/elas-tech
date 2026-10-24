package Arrays;

public class Exercicio03Arrays {

    public void main(String[] args) {
// 3 — Com o mesmo array de notas,
// calcule e mostre a soma e a média.

        int [] notas =  {8, 6, 10, 7, 9};
        int soma  = 0;

        for (int i =0 ; i< notas.length;i++) {
            soma = soma + notas [i];
        }

        double media = (double) soma / notas.length;


        System.out.println(soma);
        System.out.println(media);


    }
}
