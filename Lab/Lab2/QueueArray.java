public class QueueArray
{
	int queuearray [];
	int front;
	int len;
	int first;
	int rear;

	public QueueArray(int e)
	{
		front=0;
		len=0;
		rear=0;
		first=-1;
		queuearray=new int[e];

	}
	public void enqueue(int e)
	{
		if (isEmpty())
		{
			queuearray[0]=e;
			front=0;
			rear=0;
			first=queuearray[0];
		}
		else{
			queuearray[rear +1]=e;
			rear = rear+1;
		}
		len=len+1;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			return 0;
		}
		else{
			front=front +1;
		}
		len=len-1;
		return queuearray[front-1];

	}
	
	public int first()
	{
		if(len==0)
		{
			return 0;
		}
		else
		{
			return queuearray[front];
		}
	}

	public int len()
	{
		return len;
	}

	public boolean isEmpty()
	{
		if (len==0)
		{
			return true;
		}
		return false;
	}
}