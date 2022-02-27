public class QueueArray
{
    int[] arr;
    int front,rear;
    public QueueArray(int size)
    {
        arr = new int[size];
        rear=-1;
        front=-1;
    }
    public boolean isFull()
    {
        return(rear==arr.length-1);
    }
    public boolean isEmpty()
    {
        return(rear==-1);
    }
    public void enqueue(int num)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
        }
        else if(isEmpty())
        {
            rear++;
            front =0;
            arr[rear] = num;
        }
        else
        {
            rear++;
            arr[rear]= num;

        }


    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(arr[front]);
            front++;
            if(front>rear)
            {
                front =-1;
                rear =-1;
            }
        }
    }
}
 class test
{
    public static void main(String[] args)
    {
        QueueArray obj = new QueueArray(5);
        obj.enqueue(3);
        obj.dequeue();
        obj.enqueue(5);
        obj.dequeue();
    }
}


