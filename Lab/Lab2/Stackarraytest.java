public class Stackarraytest{
	public static void main(String[] args) {
		Stackarray obj1=new  Stackarray();
		obj1.push(2);
		obj1.push(3);
		obj1.push(4);
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		System.out.println(obj1.pop());
	}
}
