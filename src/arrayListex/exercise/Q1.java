package arrayListex.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        

    ArrayList <Integer> array1 = new ArrayList<Integer>(10);
    int ran;
    int Max= 50;
    int Min = 1;

    Scanner scan = new Scanner(System.in);
    System.out.println("Type any number between 1 and 50:");
    int num = scan.nextInt();

    for(int i=1; i<=10;i++){
        ran = (int) (Math.random()*(Max-Min)+Min);
        array1.add(ran);

    }
    
    System.out.println(array1);
    if (array1.indexOf(num) == -1){
        System.out.println("The number typed isnt in the list!");
    }else{
        
    System.out.println("The number type is at the " +(array1.indexOf(num)+1)+"th position");
    }

    scan.close();
    }
}
