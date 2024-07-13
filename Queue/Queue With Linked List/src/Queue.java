public class Queue
{
    Node front; // The first element of the Queue
    Node rear; //The last element of the Queue
    int cnt; //Counter
    int size; //The size of Queue
    public Queue(int size) //The constructive function of class Queue
    {
        this.size=size;
        cnt=0;
        front=null;
        rear=null;
    }
    void EnQueue(int data) //The method that adds
    {
        if(IsFull())
        {
            System.out.println("The queue is full,the element can not added...");
        }
        else
        {
            Node eleman=new Node(data);

            if(IsEmpty())
            {
                front=eleman;
                rear=eleman;
                System.out.println("The first element has been added to the queue:"+eleman.data);
            }
            else
            {
                rear.next=eleman;
                rear=rear.next;
                System.out.println("The element has been added to the queue:"+eleman.data);
            }
            cnt++;
        }
    }
    void DeQueue() //The method that deletes
    {
        if(IsEmpty())
        {
            System.out.println("The Queue is empty,there is no element to delete...");
        }
        else
        {
            front=front.next;
            System.out.println("The element was deleted from queue");
        }
        cnt--;
    }
    private boolean IsFull() //The method that checks whether the queue is full
    {
        if(cnt==size)
            return true;
        else
            return false;
    }

    private boolean IsEmpty() //The method that checks whether the queue is empty
    {
        if(cnt==0)
            return true;
        else
            return false;
    }
    void Print() //The method that prints
    {
        if(IsEmpty())
        {
            System.out.println("The queue is empty...");
        }
        else
        {
            Node temp=front;

            System.out.println("Data in Queue Structure");
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

}
