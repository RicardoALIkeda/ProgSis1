import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de elementos do conjunto: ");
        int n = in.nextInt();

        // Initialize array with extra space (avoid unnecessary resizing)
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o " + (i + 1) + "º elemento: ");
            arr[i] = in.nextInt();
        }

        System.out.print("Dados na ordem original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Two-pointer approach for in-place sorting with zeros at the end
        int nonZeroEnd = 0;  // Tracks the end of non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero elements to the left
                int temp = arr[nonZeroEnd];
                arr[nonZeroEnd] = arr[i];
                arr[i] = temp;
                nonZeroEnd++;
            }
        }

        System.out.print("Dados reorganizados....: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        in.close();
    }
}