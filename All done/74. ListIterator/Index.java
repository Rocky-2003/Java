import java.util.*;

class Index{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just before 
        // first element
        ListIterator<Integer> it = list.listIterator();
        
        // While there is a next element of the 
        // current iterator
        while(it.hasNext())
        {   
            // Adds an element 5 just before the 
            // current iterator position
            it.add(5);
            
            // Increments iterator one position ahead
            it.next();
        }
        
        // Print list
        System.out.println(list);
        
    }
}
