import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj mi 2 liczby");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Napisz mi co chciałbyś zrobić:");
        System.out.println("1.Dodać,2.Odjąć,3.Pomnożyć czy 4.Podzielić");
        int z = scanner.nextInt();
        switch (z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                System.out.println("Musisz coś wybrać");
                break;

        }



    }
}
