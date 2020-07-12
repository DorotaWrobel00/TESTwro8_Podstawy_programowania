import java.util.Scanner;

public class ScanerTest {

    public static void main(String[] args) {
        System.out.println("Witaj w programie, Dorota");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string = scanner.next();
        System.out.print("Podaj pozycję znaku");
        int index = scanner.nextInt();


        System.out.print("Ciąg " + string + " zawiera " + string.charAt(index) + " na pozycji " + index);

    }
}

