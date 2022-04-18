public class ScannerHomework {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Введите имя кому сказать привет:");

        String user = sc.nextLine();
        System.out.println("Привет " + user);

    }
}
