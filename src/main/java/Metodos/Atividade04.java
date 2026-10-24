/*package Metodos;
// 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas.
// No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.

import java.util.Scanner;


public class Atividade04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println(" Insira a sua primeira nota da prova: ");
        double nota01 = sc.nextDouble();
        System.out.println( " insira a sua segunda nota da prova");
        double nota02 = sc.nextDouble();

        double media = calcularMedia(nota01,nota02);

        System.out.printf(" A média é: %.2f%n",media);
         sc.close();
    }

    public static double calcularMedia(double nota01, double nota02) {
        return (nota01 + nota02) / 2;
    }
}
*/

/*package Metodos;
// 5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o
//retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.

import java.util.Scanner;


public class Atividade04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Insira sua idade : ");
        int idade = sc.nextInt();

        if ( ehMaiorDeIdade(idade)){
        System.out.println(" É maior de idade!");
       }else{
            System.out.println(" É menor de idade !");
        }
        sc.close();
    }

    public static boolean ehMaiorDeIdade (int idade) {
                return  idade >=18;
    }
    }

    */


/*package Metodos;
// 6 — Crie três métodos com o mesmo nome somar:
// um que recebe dois inteiroOS
// um que recebe três inteiros
// um que recebe dois decimais
// No main, chame os três e veja o Java escolher sozinho qual usar.
import java.util.Scanner;


public class Atividade04 {

    public static void main(String[] args) {

        System.out.println(somar(10, 20));
        System.out.println(somar(10, 5, 50));
        System.out.println(somar(2.5, 7.8));
    }

    public static int somar(int a, int b) {
        return a+ b;
    }

    public static int somar(int a, int b, int c) {
        return a+ b+ c;
    }

    public static double somar(double a, double b) {
        return a+b ;
    }
}

*/

package Metodos;
// 7 — Crie dois métodos chamados saudacao:
// um sem parâmetro, que imprime "Olá!"
// um que recebe um nome, e imprime "Olá, [nome]!"


    public class Atividade04 {

        public static void main(String[] args) {

            saudacao();
            saudacao("Camila ");
        }

        public static void saudacao() {
            System.out.println("Olá!");
        }

        public static void saudacao(String nome) {
            System.out.println("Olá, " + nome + "!");


             }
    }