package structure.row;

import structure.knot.Knot;

public class Row {
    
    private Knot refKnotEntryRow;

    public Row(){
        this.refKnotEntryRow = null;
    }


    
    public void enqueue(Object obj){
        Knot newKnot = new Knot(obj);
        newKnot.setKnotRef(refKnotEntryRow);
        refKnotEntryRow = newKnot;
    }

    public Object first(){
        if(!this.isEmpty()){
            Knot firstKnot = refKnotEntryRow;

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

    public Object dequeue(){
        if(!this.isEmpty()){
            Knot firstKnot = refKnotEntryRow;
            Knot auxiliaryKnot = refKnotEntryRow;

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

            return firstKnot.getObject();
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

        Knot auxiliaryKnot = refKnotEntryRow;

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

