package trab1.exercicio2;

public class Principal {

    public static void main(String[] args) {

        Aluno aln1 = new Aluno();
        Aluno aln2 = new Aluno();
        Aluno aln3 = new Aluno();

        aln1.setNome("Bavna Sitoe");
        aln1.setMatricula(2022101103);
        aln1.setTeste1(13);
        aln1.setTeste2(15);
        aln1.setTrabalho(15);

        aln2.setNome("Bubu Sitoe");
        aln2.setMatricula(2022101104);
        aln2.setTeste1(16);
        aln2.setTeste2(15);
        aln2.setTrabalho(15);
        aln2.media();

        aln3.setNome("Luis Bubu");
        aln3.setMatricula(2022101105);
        aln3.setTeste1(15);
        aln3.setTeste2(16);
        aln3.setTrabalho(16);
        aln3.media();

        System.out.println("Aln1=================");

        System.out.println("Nome: " + aln1.getNome());
        System.out.println("Matricula: " + aln1.getMatricula());
        System.out.println("Nota teste 1: " + aln1.getTeste1());
        System.out.println("Nota teste 2: " + aln1.getTeste2());
        System.out.println("Nota trabalho: " + aln1.getTrabalho());
        System.out.println("Media: " + aln1.media());

        System.out.println("Aln2=================");

        System.out.println("Nome: " + aln2.getNome());
        System.out.println("Matricula: " + aln2.getMatricula());
        System.out.println("Nota teste 1: " + aln2.getTeste1());
        System.out.println("Nota teste 2: " + aln2.getTeste2());
        System.out.println("Nota trabalho: " + aln2.getTrabalho());
        System.out.println("Media: " + aln2.media());

        System.out.println("Aln3=================");

        System.out.println("Nome: " + aln3.getNome());
        System.out.println("Matricula: " + aln3.getMatricula());
        System.out.println("Nota teste 1: " + aln3.getTeste1());
        System.out.println("Nota teste 2: " + aln3.getTeste2());
        System.out.println("Nota trabalho: " + aln3.getTrabalho());
        System.out.println("Media: " + aln3.media());
    }

}
