package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
      int idade = 50;

      if(idade > 18 && idade < 45) {
          System.out.println("Pode dirigir");
      } else if (idade < 10) {
          System.out.println("Você ainda é um nenem");
      } else {
          System.out.println("Velhote");
      }

    }
}
