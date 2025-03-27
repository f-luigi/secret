package OrientacaoObjeto.Classes;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    double altura;

    public String Cumprimentar() {
        return "Olá, eu sou o " + nome;
    }

    public String habilidadeEspecial() {
        return "Essa é minha habilidade estilo água, sou um ninja";
    }

    public Ninja(String nome, int idade, String aldeia, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.altura = altura;
    }

}

