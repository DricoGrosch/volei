import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Time time1 = new Time("time 1");
        Time time2 = new Time("time 2");
        Jogo jogo = new Jogo(time1, time2);
        Time vencedor = null;
        while (vencedor == null) {
            System.out.println("Time 1 :" + time1.getPontos() + "pontos - " + time1.getSetsGanhos());
            System.out.println("Time 2 :" + time2.getPontos() + "pontos - " + time2.getSetsGanhos());
            System.out.println("1- Para adicionar ponto para o time 1");
            System.out.println("2- Para adicionar ponto para o time 2");

            switch (s.nextInt()) {
                case 1: {
                    time1.setPontos(time1.getPontos() + 1);
                    break;
                }
                case 2: {
                    time2.setPontos(time2.getPontos() + 1);
                    break;
                }
            }
            jogo.getEstadoJogo();
            vencedor = jogo.retornaVencedor();
        }
        System.out.println("vencedor é:" + vencedor);
    }
}

