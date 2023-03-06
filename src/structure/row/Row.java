package structure.row;

import structure.knot.Knot;

public class Row {
    
    private Knot refKnotEntryRow;

    public Row(){
        this.refKnotEntryRow = null;
    }


    
    public void enqueue(Knot newKnot){
        newKnot.setKnotRef(refKnotEntryRow);
        refKnotEntryRow = newKnot;
    }

    public Knot first(){
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

            return firstKnot;
        }
        
        return null;
    }

    public Knot dequeue(){
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

            return firstKnot;
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

