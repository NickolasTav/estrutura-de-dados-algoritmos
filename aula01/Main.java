import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pessoa obj1 = new Pessoa();
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        System.out.println("dados de Pessoa:");
        System.out.print("Nome: ");
        obj1.setNome(input.nextLine());
        System.out.println("Idade: ");
        obj1.setIdade(input.nextInt());

        /* System.out.println(obj1.toString()); */
        listaPessoa.add(obj1);
        listaPessoa.add(new Pessoa("Jose", 35));
        listaPessoa.add(new Pessoa("Maria", 25));

        for (Pessoa auxPessoa : listaPessoa) {
            System.out.println(auxPessoa.toString());
        }

        input.close();

    }
}