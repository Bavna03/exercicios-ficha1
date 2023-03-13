package trab1.exercicio3;

public class Carro {

    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;
    private boolean ligado;

    public boolean ligar() {
        return true;
    }

    public boolean desligar() {
        return false;
    }

    public int acelerar() {
        return velocidade++;
    }

    public int frear() {
        return velocidade--;
    }

    public String dirigir() {
        return "dirigindo";
    }

}
