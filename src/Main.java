public class Main {
    public static void main(String[] args) {
        // Задание №1.1
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        // Задание №1.2
        double [] array2 = {1.57, 7.654, 9.986};
        // Задание №1.3
        int array3[] = {4, 5, 6};
        // Задание №2
        for (int i = 0; i < array2.length; i++) {
            if (i!=array2.length-1)
            System.out.print(array2[i] + ", ");
            else
                System.out.print(array2[i]);
        }
        // Задание №3
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i] += 1;
            }
            if (i!=array1.length-1)
                System.out.print(array1[i] + ", ");
            else
                System.out.print(array1[i]);


        }


        // Задание №4

                }
            }





