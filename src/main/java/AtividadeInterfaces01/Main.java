// MAIN

package AtividadeInterfaces01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


         ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }
    }

}