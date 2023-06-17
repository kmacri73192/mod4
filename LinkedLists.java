import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

/**
 *Reads a list of integer numbers from the input and saves them into a 
 *linked list sorted from smallest to largest.
 * @author kmacr
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     * Reads a list of integer numbers from the input and saves them into a 
     * linked then sorts the list from smallest to largest.
     */
    public static void main(String[] args) {

        Scanner intIn = new Scanner(System.in);
        LinkedList<Integer> lst = new LinkedList<>();
        System.out.println("Enter 10 numbers please: ");
    
        for (int i = 0; i<10; i++){
            int newInt = intIn.nextInt();
            lst.add(newInt);        
        }
        intIn.close();
        System.out.println("This is the original list: " + lst);
        
        Collections.sort(lst);
        
        System.out.println("Here is the sorted list: " + lst);

    }
 
}