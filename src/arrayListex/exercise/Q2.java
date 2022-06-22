package arrayListex.exercise;

import java.util.ArrayList;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        
    ArrayList <Integer> array2 = new ArrayList<Integer>(10);
    
    int ran;
    int Max= 50;
    int Min = 1;

    Stack<Integer> cop = new Stack<>();
    
    for(int i=0; i<10;i++){
        ran = (int) (Math.random()*(Max-Min)+Min);
        array2.add(ran);

        cop.push(array2.get(i));
    }

    array2.remove(array2.size()-1);
    array2.add(-5);

    System.out.println(array2);
    System.out.println(cop);
    }
}
