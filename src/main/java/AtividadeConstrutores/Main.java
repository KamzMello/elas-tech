package AtividadeConstrutores;
// Na Main, crie 3 agendamentos Thor, Luna e Mel:


public class Main {
    public static void main(String[] args) {

        // A) AGENDAMENTO THOR :
        Agendamento thor =  Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("alérgico a shampoo")
                .desconto(10.0)
                .build();


        // B)AGENDAMENTO LUNA:
        Agendamento luna =  Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .observacao("")
                .desconto(0.0)
                .build();

        // C) AGENDAMENTO MEL :
        Agendamento mel =  Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .observacao("")
                .desconto(0.0)
                .build();


        //D)IMPRIMINDO...
        thor.mostrar();
        System.out.println();

        luna.mostrar();
        System.out.println();

        mel.mostrar();
    }
}