package OrientacaoObjeto.Classes;

public class Main {
    public static void main(String[] args) {
        // Instãncias da classe Ninja


        // Criar Ninja Sasuke - Classe Ninja
        Uchiha sasuke = new Uchiha(); // NoArgsConstructor
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Konoha";
        sasuke.altura = 1.80f;


        // Criar Ninja Naruto - Classe Ninja
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.aldeia = "Konoha";
        naruto.altura = 1.80f;

        Uzumaki kushina  = new Uzumaki (
                "Kushina Uzumaki",
                31,
                "Konoha",
                1.61
        );





        System.out.println(naruto.habilidadeEspecial()); //Uzumaki
        System.out.println(sasuke.habilidadeEspecial());//Uchiha
        naruto.modoSabio();

    }
}
