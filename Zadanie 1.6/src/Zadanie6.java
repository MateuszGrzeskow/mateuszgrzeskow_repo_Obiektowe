import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String password = "TwojaStara";
        System.out.println("Podaj hasło:");
        var enterPassword = sc.nextLine();
        if (password.equals(enterPassword))
        {
            System.out.println("Zalogowano");
        }
        else
        {
            System.out.println("Błędne hasło");
        }
    }
}