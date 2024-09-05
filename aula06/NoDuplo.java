public class NoDuplo<T>{
     
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T dado){
        this.dado = dado;
        this.proximoNo = null;
        this.anteriorNo = null;
    }

    public T getDado(){
        return this.dado;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }

    public NoDuplo<T> getAnteriorNo(){
        return anteriorNo;
    }

    public void setproximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getproximoNo(){
        return proximoNo;
    }

    @Override
    public String toString(){
        return "{ " + getDado() + " }";
    }

}   