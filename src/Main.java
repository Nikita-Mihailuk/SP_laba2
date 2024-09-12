import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // объявление констант
        final int ARRAY_SIZE = 1000;
        final int MAX_VALUE = 10000;

        Random random = new Random();

        // инициализация и заполнение массива с помощью рандома
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(MAX_VALUE + 1);
        }

        // инициализация минимальных элементов
        int min = MAX_VALUE;
        int min3 = MAX_VALUE;
        int min7 = MAX_VALUE;
        int min21 = MAX_VALUE;

        for (int n : array){
            // поиск минимальных элементов в массиве
            if (n < min && n != 0) min = n;
            if (n < min3 && n % 3 == 0) min3 = n;
            if (n < min7 && n % 7 == 0) min7 = n;
            if (n < min21 && n % 21 == 0) min21 = n;
        }


        int mul_3_7 = 0;
        int mul_21_0 = 0;

        if(min != MAX_VALUE && min21 != MAX_VALUE) {
             mul_21_0 = min * min21; // первый случай, когда мин число образуетсся произведением числа кратного 21 и любого мин числа
        }
        if(min3 != MAX_VALUE && min7 != MAX_VALUE) {
             mul_3_7 = min3 * min7; // второй случай, когда мин число образуетсся произведением числа кратного 3 и мин числа кратного 7
        }

        // нахождение минимального из двух возможных
        int result = Math.min(mul_21_0, mul_3_7);
        // вывод
        if (result != 0) System.out.println(result);
        else System.out.println(-1);

    }
}