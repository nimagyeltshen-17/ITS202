public class Bubblesort {  
    static void bubblesort(int[] a) {  
        int n = a.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){
            	if(a[j-1] > a[j]){
					//swap elements  
					temp = a[j-1];  
					a[j-1] = a[j];  
					a[j] = temp;  
                }               
            }  
		}  
	}

    public static void main(String[] args) {  
                int a[] = {17,13,16,7,8,11}; 
                 
                System.out.println("Before Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
                System.out.println();  

                bubblesort(a);//sorting  elements using bubble sort  
                 
                System.out.println("After Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                    System.out.print(a[i] + " ");  
                }
                System.out.println(); 
   
        }  
}
