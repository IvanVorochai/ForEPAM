package module2.part1;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array1 = new int[n];

        int sumNegativ = 0;
        int sumZero = 0;
        int sumPozitiv = 0;

        System.out.print("generated random array: ");
        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * 21 - 10);
            System.out.print(array1[i] + ", ");
        }

        for (int j : array1) {
            if (j < 0) {
                sumNegativ = sumNegativ + 1;
            }
            if (j == 0) {
                sumZero++;
            } else {
                sumPozitiv++;
            }
        }
        System.out.println(String.format("\nnumber of negative: %s \nnumber of zero: %s \nnumber of pozitiv: %s ",
                sumNegativ, sumZero, sumPozitiv));
    }
}