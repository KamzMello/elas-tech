package petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;


    // Tirando o If/else do main = Arq. Petshop
    // e colocando dentro do Pet.java

    String definirPorte() {
        if (peso < 10) {
            return "pequeno";
        } else if (peso < 25) {
            return "médio";
        } else {
            return "grande";
        }
    }
     // Parte 14 - emitir som

        public void emitirSom() {
            System.out.println(nome + " faz um som.");
    }

}
