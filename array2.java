package arrays;

/**
 * Created by mike on 05/10/2016.
 */
public class array2 {

    public static void main(String[] args) {

        int value = 1;

        int[] array = new int[5];      // array

        for (int x = 0; x < 5; x++) {

            array[x] = value;

            value = value * 5;

            System.out.println();
            System.out.println(array[x]);
        }


        System.out.println();
        System.out.println("end loop");
    }
}
