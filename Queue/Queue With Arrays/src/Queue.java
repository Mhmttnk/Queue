public class Queue
{
    int dizi[];
    int size; //The size of queue
    int front; //The first element of queue
    int rear; //The last element of queue
    public Queue(int size) //The constructive function of class Queue
    {
        this.size=size;
        dizi=new int[size];
        front=0;
        rear=-1;
    }
    void Enqueue(int data) //The method that adds
    {
        if(IsFull())
        {
            System.out.println("The queue is full,the element can not added...");
        }
        else
        {
            rear++;
            dizi[rear] = data;
            System.out.println("The element has been added to the queue:"+dizi[rear]);
        }
    }
    void Dequeue() //The method that deletes
    {
        if (IsEmpty())
        {
            System.out.println("The queue is empty,There is no element to delete:");
        }
        else
        {
            int sayi = dizi[front];
            for (int i = 1; i <= rear; i++)
            {
                dizi[i - 1] = dizi[i];
            }
            rear--;
            System.out.println("The element was deleted from the queue:"+sayi);
        }
    }
    void ElemanSayisi() //The method that shows number of elements
    {
        System.out.println("The number of elements:"+(rear+1));
    }

    private boolean IsEmpty() //The method that shows whether the queue is empty
    {
        if(rear==-1)
            return true;
        else
            return false;
    }

    private boolean IsFull() //The method that shows whether the queue is full
    {
        if(rear==size-1)
            return true;
        else
            return false;
    }
}
