import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String surname = scanner.nextLine();
        System.out.println("Cześć, " + name + " " + surname);
        System.out.println("Ile masz lat?");

        int age = scanner.nextInt();
        if (age > 18){System.out.println("Jesteś pełnoletni!");}
        else {System.out.println("Jesteś niepełnoletni!");}



    }
}
