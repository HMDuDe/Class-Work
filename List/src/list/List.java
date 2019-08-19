package list;

import java.util.*;

public class List {

    ArrayList<Object> arrayList = new ArrayList<Object>();
    LinkedList<Object> linkedList = new LinkedList<Object>();
    
    public long populateArrayList(){
    
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
        
            arrayList.add(new Object());
        }
        
        long endTime = System.currentTimeMillis();
        
        long difference = endTime - startTime;
        return difference;
    }
    
    public long populateLinkedList(){
    
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++){
        
            linkedList.add(new Object());
        }
        
        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        
        return difference;
    }
    
    public long removeArrayListElements(){
    
        long startTime = System.currentTimeMillis();
        
        arrayList.remove(9000000);
        
        long endTime = System.currentTimeMillis();
        
        long difference = endTime - startTime;
        
        return difference;
    }
    
    public long removeLinkedListElements(){
    
        long startTime = System.currentTimeMillis();
        
        linkedList.remove(9000000);
        
        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        
        return difference;
    }
    
    public long getArrayList(){
    
        long startTime = System.currentTimeMillis();
        arrayList.get(9999800);
        long endTime = System.currentTimeMillis();
        
        long difference = endTime - startTime;
        
        return difference;
    }
    
    public long getLinkedList(){
    
        long startTime = System.currentTimeMillis();
        linkedList.get(9999800);
        long endTime = System.currentTimeMillis();
        
        long difference = endTime - startTime;
        
        return difference;
    }
    
    public static void main(String[] args) {
        List test = new List();
        
        System.out.println("Array list populate time: " + test.populateArrayList());
        System.out.println("Array list removing time: " + test.removeArrayListElements());
        System.out.println("Array list getting time: " + test.getArrayList());
        
        System.out.println("Linked list populate time: " + test.populateLinkedList());
        System.out.println("Linked list removing time: " + test.removeLinkedListElements());
        System.out.println("Linked list getting time: " + test.getLinkedList());
    }
}
