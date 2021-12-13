import java.util.Arrays;
import java.util.Scanner;

public class TarkovKruta {
//можно +балл?))0)

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int array[], arraysize;

        int temp = 0;

        int[] copiedArray = null;

        System.out.println("Введите размерность массива: ");

        arraysize = in.nextInt();

        array = new int[arraysize];
        System.out.println("Задайте массив: ");

        for (int i = 0; i < array.length; i++) {

            System.out.println("Введите значение " + i + " -ого элемента массива");
            array[i] = in.nextInt();

        }
        System.out.println("Исходный массив- " + Arrays.toString(array));

        System.out.println("Введите число от которого вы хотите избавиться");

        int chtoMiUdalyaem = in.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == chtoMiUdalyaem) {

                temp += 1;
                copiedArray = new int[array.length - temp];

            }
        }
        int schitayu = 0;
        for (int m = 0; m < array.length; m++) {
            if (!(array[m] == chtoMiUdalyaem) & (schitayu < copiedArray.length)) {

                copiedArray[schitayu] = array[m];
                schitayu = schitayu + 1;
            }
        }
        System.out.println("Новый массив с удаленным элементом: " + Arrays.toString(copiedArray));
    }
}