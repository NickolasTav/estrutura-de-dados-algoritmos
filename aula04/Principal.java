public class Principal{
    public static void main(String[] args){
        Fila<String> Fila1 = new Fila<String>("Aluno");

        Fila1.enfileirar("A");
        Fila1.enfileirar("B");
        Fila1.enfileirar("c");
        Fila1.enfileirar("d");

        Fila1.desenfilerar();
        Fila1.desenfilerar();
        Fila1.desenfilerar();
        Fila1.desenfilerar();


        Fila1.imprimeDados();
        
       

    }
}