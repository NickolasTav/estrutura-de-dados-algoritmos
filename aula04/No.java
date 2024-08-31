class No<T> {
    
    private T dado;
    private No<T> nextNo;


    public No(T dado){
        this.dado = dado;
        this.nextNo = null;
    }
    
    public void  setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public No<T> getNextNo() {
        return this.nextNo;
    }

    public void setNextNo(No<T> aux) {
        this.nextNo = aux;
    }
}
