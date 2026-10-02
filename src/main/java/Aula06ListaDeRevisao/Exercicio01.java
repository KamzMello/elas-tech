package Aula06ListaDeRevisao;

import java.net.SocketOption;
//import java.util.Scanner;
import java.util.Scanner;

public class Exercicio01 {
    static void main() {
            /*
        1 - Crie um programa que peça ao usuário para digitar o nome de
         um lanche e o valor dele ( QUEM COLOCA O VALOR É O USUÁRIO = SCANNER,
         INPUT= " O usuário coloca as informações")

         Em seguida, verifique: se o valor
         for maior que R$ 30.00, aplique um desconto de R$ 5.00.
         No final, exiba uma mensagem usando concatenação e printf
         para formatar o preço com duas casas decimais.
         Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
         */

        double valor;
        String nomeDoLanche;

        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble( );

        System.out.print(" Digite o nome do lanche: ");
        valor = sc.nextDouble();

        sc.nextLine();

        System.out.print( " Digite o nome do lanche:");
        nomeDoLanche = sc.nextLine();

        if (valor > 30){
            valor = valor - 5; } else { valor = valor; } System.out.printf("O lanche " + nomeDoLanche + " custa R$ %.2f%n", valor); } }
