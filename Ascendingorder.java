class Ascendingorder {    
    public static void main(String[] args)
{    
        int [] arr = new int [] {40,87,60,24,65};     
        int temp = 0;
        System.out.println("Elements of the array");    
        for (int i = 0;i<arr.length; i++)
 {     
            System.out.print(arr[i] + " ");    
}       
        for (int i = 0;i<arr.length; i++) {     
            for (int j = i+1;j<arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();      
        System.out.println("Elements of array in ascending order: ");
        int n;    
        for (int i = 0;i<arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    