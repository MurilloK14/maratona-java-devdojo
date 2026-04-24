package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado) // pode colocar a expressão booleana dentro do if, dessa forma: if(idade >= 18)
        {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        else // senão
        {
            System.out.println("Não está autorizado a comprar bebida!");
        }

        // if false
        if (!isAutorizado) // ou if(isAutorizado == false)
        {
            System.out.println("Não está autorizado a comprar bebida!");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("verdadeiro ou falso");
        }
        System.out.println("Fora do if");
    }
}
