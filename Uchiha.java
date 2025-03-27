package OrientacaoObjeto.Classes;

public class Uchiha extends Ninja {

    public void SharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public String habilidadeEspecial() {
        return "Esse é meu ataque de fogo, sou um uchiha";
    }

    public Uchiha(String nome, int idade, String aldeia, double altura) {
        super(nome, idade, aldeia, altura);
    }
}
