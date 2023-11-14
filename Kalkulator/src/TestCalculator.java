import java.util.Scanner;
public class TestCalculator {
    public static void main(String[] args) {
        double wynik=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w prostym kalkulatorze");
        System.out.println("Wpisz jaka liczbe chcesz wpisac");
        System.out.println("Wpisz liczbe 1");
        double liczba1 = scanner.nextDouble();
        System.out.println("Wpisz liczbe 2");
        double liczba2 = scanner.nextDouble();
        System.out.println("Wybierz operacje");
        System.out.println("Dodawanie, wpisz 1");
        System.out.println("Odejmowanie, wpisz 2");
        System.out.println("Mnożenie, wpisz 3");
        System.out.println("Dzielenie wpisz 4");
        System.out.print("Twój wybór: ");
        int wybor = scanner.nextInt();
        switch(wybor) {
            case 1:
                wynik = Calculator.addition(liczba1, liczba2);
                break;
            case 2:
                wynik=Calculator.substraction(liczba1,liczba2);
                break;
            case 3:wynik=Calculator.multiplication(liczba1,liczba2);
                  break;
            case 4:wynik=Calculator.divided(liczba1,liczba2);
        };
        System.out.println(wynik);
    }}

class Calculator{
    public static double addition(double a, double b){
        return a+b;
    }
    public static double substraction(double a,double b){
        return a-b;
    }
    public static double divided(double a,double b){
        if(b!=0){
            return a/b;
        }
        else if(b==0) return 0;
        return 0;



    }
    public static double multiplication(double a, double b){
        return a*b;
    }
}