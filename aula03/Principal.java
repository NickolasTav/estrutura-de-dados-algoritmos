public class Principal{
    public static void main(String[] args){
        Lista<String> lista1 = new Lista<String>("Aluno");



        lista1.addInicio("oi");
        lista1.imprimeDados();
        lista1.addInicio("tudo");
        lista1.imprimeDados();
        lista1.addFinal("bem?");
        lista1.imprimeDados();

        lista1.imprimeDados();

        lista1.removeInicio();
        lista1.imprimeDados();
        lista1.removeFinal();
        lista1.imprimeDados();

        

    }
}