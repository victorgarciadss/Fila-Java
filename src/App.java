import structure.row.Row;

public class App {
    public static void main(String[] args) throws Exception {
        
        Row<String> row = new Row<>();

        row.enqueue("Primeiro");
        row.enqueue("segundo");
        row.enqueue("terceiro");
        row.enqueue("quarto");
        row.enqueue("quinto");

        System.out.println(row);

        System.out.println(row.dequeue());

        System.out.println(row);
        

        row.enqueue("Último");
        System.out.println(row);

        System.out.println(row.first());

        System.out.println(row);

    }
}
