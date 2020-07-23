import java.util.Scanner;

/**
 * Realizacja zadania 3 z listy C2
 */
public class Fibonacci {
    /**
     * metoda realizująca generowanie ciągu fibonacciego o podanej długości
     * @param length - rządana długość ciągu
     * @return tablica z elementami ciągu rządanej długości
     */
    public static int[] generate(int length) {
        int[] result = new int[length]; // inicializajca tablicy rządanej wielkości
        result[0] = 0; // pierwszy element ciągu to zero
        result[1] = 1; // drugi to jeden
        for (int i = 2; i < length; i++) { // pozostałe elementy ciągu generujemy iteracyjnie od trzeciego (indeks równy 2) do końca pojemności tablicy
            result[i] = result[i - 1] + result[i - 2]; // każdy kolejny element ciągu to suma dwóch poprzednich
        }
        return result; // zwrócenie wyniku
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tradycyjnie inicjalizacja skanera
        System.out.println("Proszę podać długość ciągu: "); // prośba o podanie długości ciągu
        int length = scanner.nextInt(); // inicjalizacja zmiennej wartością otrzymaną ze skanera (pobraną z konsoli)
        System.out.println("Generuję wartości ciągu fibonacciego dla długości: " + length); // wyświetlenie jaką długość odczytaliśmy
        int[] result = generate(length); // wywołanie statycznej metody generującej wartości ciągu fibonacciego
        System.out.println("Wartości elementów ciągu są następujące: "); // informacja że będziemy drukować elementy
        for (int index = 0; index < length; index++) { // iteracja od początku do końca tablicy
            System.out.println("result[" + index + "] = " + result[index]); // wyświetlenie wartości
        }
    }
}
