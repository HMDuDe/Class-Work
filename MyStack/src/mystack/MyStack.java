package mystack;

public class MyStack {

    int[] array = new int[10];
    int count = 0;

    public void push(int object) throws Exception {
        //Only push if the stack is not full
        if (count == array.length) {
            throw new Exception();
        } else {
            array[count++] = object;
        }
    }

    public int pop() throws Exception {
        if (count == 0) {
            throw new Exception();
        } else {
            int result = array[--count];
            array[count] = 0;
            return result;
        }
    }

    public int getTop() throws Exception {
        if (count == 0) {
            throw new Exception();
        } else {
            return array[count - 1];
        }
    }
    
    public int[] myArray(){
        return array;
    }

}
