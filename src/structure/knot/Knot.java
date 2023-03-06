package structure.knot;

public class Knot {
    
    private Object object;
    private Knot knotRef;

    public Knot(Object object){
        this.knotRef = null;
        this.object = object;
    }


    public Object getObject(){
        return object;
    }

    public void setObject(Object object){
        this.object = object;
    }

    public Knot getKnotRef(){
        return knotRef;
    }

    public void setKnotRef(Knot knotRef){
        this.knotRef = knotRef;
    }

    @Override
    public String toString(){
        return "Nó{Objeto=" + object + "}";
    }
}
