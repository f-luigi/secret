package OrientacaoObjeto.Classes;

public class Uzumaki extends Ninja {

    @Override
    public String habilidadeEspecial() {
        return "Usei minha habililidade especial Rasengan, sou um uzumaki";
    }

    public void modoSabio() {
        System.out.println("Entrei no módo Sábio, sou um uzumaki");
    }

    //AllArgsConstructor
    public Uzumaki(String nome, int idade, String aldeia, double altura) {
       super(nome, idade, aldeia, altura);
    }

}
