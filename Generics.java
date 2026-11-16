
/*
 * Name: Joshua Barrett
 * Class: CISC 191
 * Assignment: Generics - Sort ArrayList
 * Description: Uses a generic method to sort an ArrayList in ascending order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Generics {

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(smallestIndex)) < 0) {
                    smallestIndex = j;
                }
            }

            E temp = list.get(i);
            list.set(i, list.get(smallestIndex));
            list.set(smallestIndex, temp);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        sort(numbers);

        System.out.print("The sorted numbers are");

        for (int number : numbers) {
            System.out.print(" " + number);
        }

        System.out.println();
        input.close();
    }
}
