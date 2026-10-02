package Metodos;


import jdk.swing.interop.SwingInterOpUtils;



// 1 — Na mesma classe do main (PRIMEIRA BOQUINHA), crie um método chamado mostrarBoasVindas()
//  que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
// O método vai fora do main, mas dentro da classe, no mesmo nível do main,
//  logo abaixo dele. Se você tentar criar um método dentro do main, não compila.
//Nos próximos, crie uma classe separada para guardar os métodos
// (pode ser uma só, chamada Utilidades, ou uma por exercício, você decide).
// Lembre que para chamar, você precisa escrever o nome da classe na frente: Utilidades.dobro(5).

 public class AtividadeMetodos01 {

     public static void main(String[] args) {
         Utilidades.mostrarBoasVindas();
     }
 }
