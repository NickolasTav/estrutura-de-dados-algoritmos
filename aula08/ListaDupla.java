public class ListaDupla<T> {

    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDupla() {
        this("Lista duplamente encadeada");
    }

    public ListaDupla(String nomeLista) {
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
        if (primeiroNo == null) {
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            novoNo.setproximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndices();
        tamanho++;
    }

    public void addMeio(T dado, int posicao){
        if (posicao <= 0){
            addInicio(dado);
            return;
        }
        if(posicao >= tamanho){
            addFinal(dado);
            return;
        }

        NoDuplo<T> novoNo = new NoDuplo<T>(dado, posicao);
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while(atual != null && indice < posicao){
            atual.getproximoNo();
            indice++;
        }

        NoDuplo<T> anterior = atual.getAnteriorNo();
        novoNo.setproximoNo(atual);
        novoNo.setAnteriorNo(anterior);

        anterior.setproximoNo(novoNo);
        atual.setAnteriorNo(novoNo);

        atualizaIndices();
        tamanho++;

    }

    public void removerMeio(int posicao){
        if(posicao <=0){
            removerInicio();
            return;
        }
        if(posicao >= tamanho -1){
            removerFinal();
            return;
        }

        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual != null && indice < posicao) {
            atual = atual.getproximoNo();
            indice++;            
        }

        NoDuplo<T> anterior = atual.getAnteriorNo();
        NoDuplo<T> proximo = atual.getproximoNo();

        if(anterior != null){
            anterior.setproximoNo(proximo);
        }

        if(proximo != null){
            proximo.setAnteriorNo(anterior);
        }

        System.out.println("Dado: " + atual.getDado() + " removido da lista");
        atualizaIndices();
        tamanho--;
    }   

    public void removerInicio(){
        if(primeiroNo == null){
            System.out.println("LISTA VAZIA");
        }else{
            System.out.println("Dado: " + primeiroNo.getDado() + "removido da lista " + nomeLista);
            primeiroNo = primeiroNo.getproximoNo();
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = null;
            }
            atualizaIndices();
            tamanho--;
        } 
    }

    public void addFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, tamanho);
        if (ultimoNo == null) {
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setproximoNo(novoNo);
            ultimoNo = novoNo;
        }
        tamanho++;
    }


    public void removerFinal(){
        if(ultimoNo == null){
            System.out.println("LISTA VAZIA");
        }else{
            System.out.println("Dado: " + ultimoNo.getDado() + "removido da lista " + nomeLista);
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setproximoNo(null);
            }else{
                primeiroNo = null;
            }
            tamanho--;
        }
    }

    private void atualizaIndices(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while(atual != null){
            atual.setIndice(indice);
            atual = atual.getproximoNo();
            indice++;
        }
    }

    public void imprimeLista() {
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.printf("dados da lista %s:\n", nomeLista);
            NoDuplo<T> aux = primeiroNo;

            while (aux != null) {
                System.out.printf(" %s ", aux.toString());
                aux = aux.getproximoNo();
            }
            System.out.println("");
        }

    }
}
