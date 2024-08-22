
public class Principal{
    public static void main(String[] args){
        No<String> obj1 = new No<String>("NIck");
       /*  System.out.println(obj1.imprimeDados()); */

        No<String> obj2 = new No<String>("Lara");
        /* System.err.println(obj2.imprimeDados()); */

        No<String> obj3 = new No<String>("Maria");
        /* System.err.println(obj3.imprimeDados()); */

        obj1.setAux(obj2);
        obj2.setAux(obj3);

        /* System.out.println(obj1.getAux().imprimeDados()); */

        No<String> objAux = obj1;

        while(objAux != null){
            System.out.println(objAux.imprimeDados());
            objAux = objAux.getAux();
        }

    }
}