/* TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


//4 — Crie uma variável String nome = null; e tente imprimir nome.length().
// Trate a NullPointerException e mostre "O nome não foi preenchido."


public class Atividade01Tratamento {

    public static void main(String[] args) {

        String nome = null;


        try {
            System.out.println(nome.length());


        } catch (NullPointerException e)  {

            System.out.println(" O nome não foi preenchido.");

        } finally {

            System.out.println( " fim");
        }

    }
}
*/


package TratamentoDeExcecoes;

// 5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
// Trate a ArithmeticException para o caso de ela digitar 0.

import java.util.Scanner;

public class Atividade01Tratamento {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {

                System.out.println(" Digite um número inteiro:  ");
                int numero = sc.nextInt();

                // resto da divisão

                System.out.println(100 % numero);


            } catch (ArithmeticException e){
            System.out.println(" Atenção! não é possível dividir por 0.");

        }finally{

        sc.close();


    }
    }
}




