package eduard.javaBasics.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTasks {
    public static void main(String[] args) {
//        task 1
        int [] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
            }
        int counter = 0;
        for (int i = 0; i < mainTab.length; i++) {
            if (i < 10) {
                System.out.print("0" + mainTab[i] + ", ");
            } else {
                System.out.print(mainTab[i] + ", ");
            }
            counter++;
            if (counter == 10) {
                System.out.println("\b");
                counter = 0;
            }
        }

//        task 2
        int min = 246000000;
        int [] randNumbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
            if (randNumbers[i] < min) {
                min = randNumbers[i];
            }
        }
        System.out.println(min);

//        task 3
        int [] tenElements = new int[10];
        Arrays.fill(tenElements, 2);
        System.out.println(Arrays.toString(tenElements));

//        task 4
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }
        int [] reverse = new int[10];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));

//        task 5
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        task 6
        int [] secondNumbers = new int[10];
        int [] sumArray = new int[10];
        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = random.nextInt(1001);
            sumArray[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secondNumbers));
        System.out.println(Arrays.toString(sumArray));

//        task 7
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(append(arr1)));
        System.out.println(Arrays.toString(append(arr2)));
    }

//    task 7
    public static int[] append(int[] arr) {
        int [] newArr = Arrays.copyOf(arr, arr.length * 2);
        for (int i = 0; i < arr.length; i++) {
            newArr[newArr.length - 1 - i] = arr[i];
        }
        return newArr;
    }
}
