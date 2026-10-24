package ForEach;


public class Atividade03 {

    // 3. Com o array de notas {8, 6, 10, 7},
    // use for-each para somar
    //   todas e mostrar a soma e a média.

    public static void main(String[] args) {

        double [] notas =  {8, 6, 10, 7};

        double soma = 0;



        for (double nota: notas) {

            soma+= nota;

        }
            System.out.println( " Somar notas :"  +soma);
            System.out.println( " Média notas : " + soma / notas.length);



    }



}
