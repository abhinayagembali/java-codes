class Duplicatenumber
 {  
    public static void main(String[] args) 
{    
        int [] arr = new int [] {12,24,1,2,3,4,5,3,3,7};   
          
        System.out.println("Duplicate number in given array"); 
        for(int i = 0; i < arr.length; i++) 
{  
            for(int j = i + 1; j < arr.length; j++) 
{  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
