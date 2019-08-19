//Recursive method reffers to a method that 
//directly or indirectly calls itself.
package recursion;

public class Recursion {

    //Recursive method (example 1)
    public long factorial(int x){
        if(x == 0){
            return 1;
            
        }else{
            //Method calling itsself
            return x * factorial(x -1);
            
        }
    }
    
    //(Example 2)
    public int countZeros(int[] x, int index){         
        if(index == 0){
            return x[0] == 0 ? 1: 0;
            
        }else if(x[index] == 0){
            return 1 + countZeros(x, index -1);
            
        }else{
            return countZeros(x, index -1);
            
        }
    }
    
    public static void main(String[] args) {
        Recursion test = new Recursion();
        
        System.out.println(test.factorial(5));
    }
}
