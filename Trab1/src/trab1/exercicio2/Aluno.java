package trab1.exercicio2;

public class Aluno {

    private String nome;
    private int matricula;
    private double teste1;
    private double teste2;
    private double trabalho;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTeste1(double teste1) {
        this.teste1 = teste1;
    }

    public void setTeste2(double teste2) {
        this.teste2 = teste2;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getTeste1() {
        return this.teste1;
    }

    public double getTeste2() {
        return this.teste2;
    }

    public double getTrabalho() {
        return this.trabalho;
    }

    public double media() {
        return teste1 * 0.4 + teste2 * 0.4 + trabalho * 0.20;
    }
}
