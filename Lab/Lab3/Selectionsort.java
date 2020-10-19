import java.util.Scanner;
public class Selectionsort{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    Selectionsort obj1 = new Selectionsort();
    System.out.print("Create the length of the array : ");
    int length = obj.nextInt();
    int Array[] = new int[length];
    for(int i = 0; i < length; i++){
      System.out.print("Enter the elements of the Array : ");
      int a = obj.nextInt();
      Array[i] = a;
    }
    for(int j = 0; j < Array.length; j++){
      System.out.print(Array[j] + " ");
    }
    System.out.println();
    obj1.Selectionsort(Array);
    obj1.printArray(Array);
  }
  public void Selectionsort(int Array[]){
    int n = Array.length;
    for(int i = 0; i < n-1; i++){
      int minValue = i;
      for(int j = i + 1; j < n; j++){
        if(Array[j] < Array[minValue]){
          minValue = j;
        }
      }
      int temp = Array[minValue];
      Array[minValue] = Array[i];
      Array[i] = temp;
    }
  }
  public void printArray(int Array[]){
    int n = Array.length;
    for(int i : Array){
      System.out.print(i + " ");
    }
  }
}
