/*package TratamentoDeExcecoes;
// 1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException
// e mostre uma mensagem explicando que não dá pra dividir por zero.
import java.util.Scanner;

public class TratamentoDeExcecoesExercicios {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {

                System.out.println(" Digite o primeiro número inteiro:  ");
                int numero01 = sc.nextInt();

                System.out.println(" Digite o segundo númeto inteiro:   ");
                int numero02 = sc.nextInt();


                // divisão

                System.out.println(numero01 / numero02);


            } catch (ArithmeticException e){
            System.out.println(" Atenção! não é possível dividir por 0.");

        }finally{

        sc.close();


    }
    }
}
*/

/*
package TratamentoDeExcecoes;
//2 — Crie um array com 5 notas. Peça uma posição para a pessoa e
// mostre a nota daquela posição. Se a posição não existir,
// trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.


import java.util.Scanner;

public class TratamentoDeExcecoesExercicios {

    public static void main(String[] args) {

        int []  notas =   { 5,8,10,7,3 };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" Digita a posição da nota ( 0  a 4): ");
            int posicao = sc.nextInt();

            System.out.println(notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e)  {

            System.out.println(" Posição inválida! A opção vai de 0 a 4.");
        } finally {
            sc.close();
        }

    }
}

*/



package TratamentoDeExcecoes;
// 6-  Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem
//  "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."


public class TratamentoDeExcecoesExercicios {

        public static void main(String[] args) {

            String [] nomes = { "Camila", " Henri" , "Patricia"};

        

        try {
        System.out.println(nomes [5]);


    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println( " essa posição não existe");
    }
        System.out.println( " o programa continua funcionando");
}
        }



