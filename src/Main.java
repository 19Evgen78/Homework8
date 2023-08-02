import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        double[] number = {1.57, 7.654, 9.986};
        int[] weightDog = new int[]{4, 5, 4};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[]{1, 2, 3};
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + "," + " ");
        }
        double[] number = {1.57, 7.654, 9.986};
        number[0] = 1.57;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + "," + " ");
        }
        int[] weightDog = new int[]{4, 5, 4};
        weightDog[0] = 4;
        for (int i = 0; i < weightDog.length; i++) {
            if (i == weightDog.length - 1) {
                System.out.println(weightDog[i]);
                break;
            }
            System.out.print(weightDog[i] + "," + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[]{1, 2, 3};
        arr[0] = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i == arr.length - 3) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr [i] + "," + " ");
        }
        double[] number = {1.57, 7.654, 9.986};
        number[0] = 1.57;
        for (int i = number.length - 1; i >= 0; i--) {
            if(i == number.length - 3) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + "," + " ");
        }
        int[] weightDog = new int[] {4, 5, 4};
        weightDog[0] = 4;
        for (int i = weightDog.length - 1; i >= 0; i--) {
            if(i == weightDog.length - 3) {
                System.out.println(weightDog[i]);
                break;
            }
            System.out.print(weightDog[i] + "," + " ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        System.out.println(Arrays.toString(arr));

    }
}
