package structure.row;

import structure.knot.Knot;

public class Row<T> {
    
    private Knot<T> refKnotEntryRow;

    public Row(){
        this.refKnotEntryRow = null;
    }


    
    public void enqueue(T object){
        Knot<T> newKnot = new Knot<>(object);
        newKnot.setKnotRef(refKnotEntryRow);
        refKnotEntryRow = newKnot;
    }

    public T first(){
        if(!this.isEmpty()){
            Knot<T> firstKnot = refKnotEntryRow;

            while(true){
                if(firstKnot.getKnotRef() != null){
                    firstKnot = firstKnot.getKnotRef();
                }
                else{
                    break;
                }
            }

            return firstKnot.getObject();
        }
        
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Knot<T> firstKnot = refKnotEntryRow;
            Knot<T> auxiliaryKnot = refKnotEntryRow;

            while(true){
                if(firstKnot.getKnotRef() != null){
                    auxiliaryKnot = firstKnot;
                    firstKnot = firstKnot.getKnotRef();
                }
                else{
                    auxiliaryKnot.setKnotRef(null);
                    break;
                }
            }

            return (T)firstKnot.getObject();
        }
        
        return null;
    }


    public boolean isEmpty(){
        if(refKnotEntryRow == null){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        String rowString = "";

        Knot<T> auxiliaryKnot = refKnotEntryRow;

        if(refKnotEntryRow != null){
            while(true){
                rowString += "[Nó{objeto=" + auxiliaryKnot.getObject() + "}] ---> ";
                
                if(auxiliaryKnot.getKnotRef() != null){
                    auxiliaryKnot = auxiliaryKnot.getKnotRef();
                }
                else{
                    rowString += "null";
                    break;
                }
            }
        }
        else{
            rowString = "null";
        }

        return rowString;
    }
}

