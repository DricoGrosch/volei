public class Time {
    private String nome;
    private int setsGanhos;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.setsGanhos = 0;
    }

    public void vencerSet() {
        this.setsGanhos++;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSetsGanhos() {
        return setsGanhos;
    }

    public void setSetsGanhos(int setsGanhos) {
        this.setsGanhos = setsGanhos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
