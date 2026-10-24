package petshop;

import java.util.Scanner;

import java.util.InputMismatchException; // parte 10- para tratar os erros do menu

import java.util.HashSet; // parte 11- hashSet- Mostra quantas espécies existem.

import java.util.ArrayDeque; // PARTE 12- ArrayDeque = funciona como uma fila para o banho

import java.util.ArrayList; // parte - 13 = Serviços do PetShop

public class Petshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Criei uma array com espaço para 5 pets
        Pet[] pets = new Pet[5];

        ArrayDeque<String> fila = new ArrayDeque<>(); // parte 12- fila

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {

            System.out.println();
            System.out.println("=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets"); // parte 08
            System.out.println("3 - Buscar pet pelo nome"); // parte 09
            System.out.println("4 - Mostrar espécies cadastradas"); // parte 11
            System.out.println("5 - Entrar na fila de banho"); //parte 12
            System.out.println("6 - Atender próximo da fila"); // parte 12
            System.out.println("7 - Executar serviços"); // parte 13
            System.out.println("8 - Emitir som dos pets"); // parte 14
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");

            try { // parte 10
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:
                        if (total == pets.length) {
                            System.out.println("Limite de 5 pets atingido.");
                            break;
                        }

                        System.out.print("Espécie do seu pet: ");
                        String especieDigitada = sc.nextLine();

                        Pet pet;

                        if (especieDigitada.equalsIgnoreCase("cachorro")) {
                            pet = new Cachorro();
                        } else if (especieDigitada.equalsIgnoreCase("gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

                        pet.especie = especieDigitada;


                        System.out.print("Nome do seu Pet: ");
                        pet.nome = sc.nextLine();

                        System.out.print("Peso do seu Pet: ");
                        pet.peso = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        pets[total] = pet;
                        total++;

                        System.out.println(" Pet cadastrados! Agora são " + total + " pet(s)");
                        break;

                    case 2: // parte08
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println();
                            System.out.println("--- PETS CADASTRADOS ---");

                            for (int i = 0; i < total; i++) {
                                System.out.println(
                                        pets[i].nome + " (" + pets[i].especie + ") - "
                                                + pets[i].peso + " kg - Porte "
                                                + pets[i].porte
                                );
                                pets[i].emitirSom(); // parte 15
                                mesmoNome(pets[i]); // parte 16
                                mesmoNome(pets[i], "---"); // parte 16
                            }
                        }

                        break;

                    case 3: // parte 08
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println(
                                        "Encontrado: " + pets[i].nome
                                                + " (" + pets[i].especie + ") - "
                                                + pets[i].peso + " kg"
                                );

                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4: // parte 11 - HASHSET = GUARDA AS ESPÉCIES
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);
                        }
                        System.out.println("--- ESPÉCIES CADASTRADAS ---");

                        for (String especie : especies) {
                            System.out.println("- " + especie);
                        }

                        System.out.println(
                                "Total de espécies diferentes: " + especies.size()
                        );
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();

                        fila.add(nomeFila);

                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);
                        break;

                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximo = fila.peek();

                            System.out.println("Próximo da fila: " + proximo);

                            fila.poll();
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + fila);
                        }
                        break;


                    case 7: // parte 13- serviços do petShop
                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomePet);
                        }
                        break;


                    case 8: // parte 14

                        for (int i = 0; i < total; i++) {
                            pets[i].emitirSom();
                        }
                        break;


                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();

            }
        }
        sc.close();
    }

        static void mesmoNome(Pet pet) {
            System.out.println("Nome: " + pet.nome);
    }

    static void mesmoNome(Pet pet, String texto) {
        System.out.println(texto);
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);
    }
}