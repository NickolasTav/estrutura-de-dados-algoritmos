public class Principal{
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Nomes");

        lista.imprimeLista();
        lista.addInicio("Níckolas");
        lista.imprimeLista(); 
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();
        lista.removerInicio();
        lista.imprimeLista();
        lista.removerFinal();
        lista.imprimeLista();
    }
}