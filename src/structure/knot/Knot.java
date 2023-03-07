package structure.knot;

public class Knot<T> {
    
    private T object;
    private Knot<T> knotRef;

    public Knot(T object){
        this.knotRef = null;
        this.object = object;
    }


    public T getObject(){
        return object;
    }

    public void setObject(T object){
        this.object = object;
    }

    public Knot<T> getKnotRef(){
        return knotRef;
    }

    public void setKnotRef(Knot<T> knotRef){
        this.knotRef = knotRef;
    }

    @Override
    public String toString(){
        return "Nó{Objeto=" + object + "}";
    }
}
