//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Adding and Deleting Operations in the Queue
        //The logic of the queue is "First In, First Out"

        Queue queue=new Queue(4);

        queue.EnQueue(25);
        queue.EnQueue(50);
        queue.EnQueue(75);
        queue.EnQueue(100);
        queue.EnQueue(125);

        queue.DeQueue();

        queue.Print();
    }
}