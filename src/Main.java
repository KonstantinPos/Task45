public class Main {
    public static void main(String[] args) {
        int arr[] = new int[12];
        int plus = 0;
        int minus = 0;
        //Проверка на 0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
            if (arr[i] == 0) {
                arr[i] = arr[i] + 1;
            }
        }
        //подсчитываем количество положительных и отрицательных индексов
        System.out.println("Массив из случайных чисел");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                minus++;
            }
            if (arr[i] > 0) {
                plus++;
            }
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        if (plus > minus) {

            for (int j = 0; j < (plus - minus) / 2; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        arr[i] = arr[i] * (-1);
                        break;
                    }

                }
            }

        }
        if (plus < minus) {
            for (int i = 0; i < Math.abs((plus - minus) / 2); i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        arr[j] = arr[j] * (-1);
                        break;
                    }
                }
            }
        }
        System.out.println("Массив состоящий из 6 положительных и 6 отрицательных чисел");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
