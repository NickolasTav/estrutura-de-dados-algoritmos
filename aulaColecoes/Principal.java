
import java.util.ArrayList;
import java.util.Iterator;

public class Principal{
    public static void main(String[] args){
        /* System.out.println('\u000C');
        ArrayList<String> listaEstado = new ArrayList<String>();

        listaEstado.add("São Paulo");
        listaEstado.add("Rio de Janeiro");
        listaEstado.add("Minas Gerais");
        listaEstado.add("São Paulo");

        Iterator i = listaEstado.iterator();
        while(i.hasNext()){
            String estado = i.next().toString();

            System.out.println("Estado: " + estado);
        }
        System.out.println("*** " + listaEstado.get(2) + " ***");
    } */

    ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();


    listaPessoa.add(new Pessoa("Níckolas",21));
    listaPessoa.add(new Pessoa("Vitor",21));
    listaPessoa.add(new Pessoa("Rogerio",19));

    Iterator i = listaPessoa.iterator();
        while(i.hasNext()){
            String pessoa = i.next().toString();
            System.out.println(pessoa);
        }
        System.out.println("*** " + listaPessoa.get(2) + " ***");
}
}