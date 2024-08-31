public class Principal {
    public static void main(String[] args){
        System.out.println("=== Testando Pilha ===");
        Pilha<String> pilha = new Pilha<String>("LETRAS");

        pilha.push("A");
        pilha.push("B");
        pilha.imprimePilha();
        

        System.out.println("Topo da pilha: "+ pilha.peek());
        System.out.println("Elemento removdo: " + pilha.pop());
        pilha.imprimePilha();        
    }
}
