import structure.knot.Knot;
import structure.row.Row;

public class App {
    public static void main(String[] args) throws Exception {
        
        Row row = new Row();

        row.enqueue(new Knot("Primeiro"));
        row.enqueue(new Knot("segundo"));
        row.enqueue(new Knot("terceiro"));
        row.enqueue(new Knot("quarto"));
        row.enqueue(new Knot("quinto"));

        System.out.println(row);

        System.out.println(row.dequeue());

        System.out.println(row);
        

        row.enqueue("Último");
        System.out.println(row);

        System.out.println(row.first());

        System.out.println(row);

    }
}
