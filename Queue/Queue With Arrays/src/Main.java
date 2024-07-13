//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Queue queue=new Queue(4);

        queue.Enqueue(100);
        queue.Enqueue(200);
        queue.Enqueue(300);
        queue.Enqueue(400);
        queue.Enqueue(500);

        queue.Dequeue();
        queue.Dequeue();
        queue.ElemanSayisi();
    }
}