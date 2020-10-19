public class Queuearraytest{
	public static void main(String []args)
	{
		Queuearray obj=new Queuearray(4);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(7);
		obj.enqueue(8);
		System.out.println(obj.len());
		System.out.println(obj.first());
		System.out.println(obj.isEmpty());
		System.out.println(obj.dequeue());
	


	}
}
