class Pilha <T> {

    private No<T> topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha) {
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public T peek(){
        if(topo == null){
            System.out.println("Pilha Vazia");
            return null;
        }
        return topo.getDado();
    }

    public T pop(){
        if(topo == null){
            System.out.println("Pilha Vazia");
            return null;
        }else{
            T dadoTempo = topo.getDado();
            topo = topo.getNextNo();
            return dadoTempo;
        }
    }

    public void imprimePilha(){
        if(topo == null){
            System.out.println("Pilha Vazia");
        }else{
            System.out.println("Dados da pilha " + nomePilha);
            No<T> aux = topo;
            while(aux != null){
                System.out.println("{ " + aux.getDado() + " }");
                aux = aux.getNextNo();
            }
        }
    }
}
