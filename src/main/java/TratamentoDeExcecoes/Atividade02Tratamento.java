package TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

//3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
//trate a InputMismatchException e mostre uma mensagem pedindo um número.

public class Atividade02Tratamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
             System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Sua idade é: " + idade);

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro!");

        } finally {
            sc.close();

        }
    }
}




