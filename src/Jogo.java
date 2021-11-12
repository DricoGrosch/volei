public class Jogo {
    Time time1;
    Time time2;
    private int finalSet = 25;
    private int setAtual = 1;

    public Jogo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public int getFinalSet() {
        return finalSet;
    }

    public void getEstadoJogo() {
        int limiteSet = 25;
        if (this.setAtual == 5) {
            limiteSet = 15;
        }
        if (this.time1.getPontos() < limiteSet && this.time2.getPontos() < limiteSet) {
            return;
        }

        if (this.time1.getPontos() - this.time2.getPontos() >= 2) {
            this.time1.vencerSet();
            setAtual++;
        }
        if (this.time2.getPontos() - this.time1.getPontos() >= 2) {
            this.time2.vencerSet();
            setAtual++;
        }
    }

    public Time retornaVencedor() {
        if (this.time1.getSetsGanhos() == 3) {
            return this.time1;
        } else if (this.time2.getSetsGanhos() == 3) {
            return this.time2;
        }
        return null;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public int getSetAtual() {
        return setAtual;
    }

    public void setSetAtual(int setAtual) {
        this.setAtual = setAtual;
    }

    public void novoSet() {
        this.time1.setPontos(0);
        this.time2.setPontos(0);
    }
}
