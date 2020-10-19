public class Arraylist {
	double one_fourth;
	double three_fourth;
	int Max;
	int Remove;
	int Top;
	static double length;
	static int i;
	static int array[];

	public Arraylist() {
		one_fourth = 0.25;
		three_fourth = 0.75;
		Max = 4;
		Top = 0;
		array = new int[Max];
	}

	public void add(int e) {
		array[Top] = e;
		Top = Top + 1;
	}

	public void pop() {
		Top = Top - 1;
		Remove = array[Top];
		array[Top] = 0;
		int count = 0;

		for(int i = 0; i < array[i]; i++) {
			count = count + 1;
		}

		i = count;
		length = (double)i / Max;
		System.out.println("Remove element " + Remove);
	}
	
	public void Resize() {
		if(length == one_fourth ) {
			int newarray[] = new int[(Max / 2) * 2];

			for(int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}

			array = newarray;
			Max = Max / 2;

			for(int n : newarray) {
				System.out.print(n + " ");
			}	
		}
		else if(length == three_fourth) {
			int newarray[] = new int[Max * 2];

			for(int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}

			Max = Max * 2;
			array = newarray;

			for(int j : newarray) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange.");
		}
	}
	public int Size() {
		return Max;
	}

	public String toString() {
		String string = Integer. toString(Max);
		return string;
	}
	public static void main(String[] args) {
		Arraylist obj = new Arraylist();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.pop();
		obj.Resize();
		System.out.println("toString " + obj.toString());
		System.out.println("The number of elements in  new Array is " + obj.i);
		System.out.println("The Size of new array is " + obj.Size());					
	}
}