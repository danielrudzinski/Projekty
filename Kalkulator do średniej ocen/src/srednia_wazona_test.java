import java.util.Scanner;
public class srednia_wazona_test {
    public static void main(String[] args) {
        System.out.println("Podaj ilosc ocen");
        Scanner scanner = new Scanner(System.in);
        int oceny = scanner.nextInt();

        double licznik=0;
        for(int i=0;i<oceny;i++){
            System.out.println("Podaj ocene " + (i+1));
            int ocena = scanner.nextInt();
            licznik=licznik+ocena;

        }
        double srednia_ocen=licznik/oceny;
        System.out.println("Twoja srednia to "+ srednia_ocen);
        if(srednia_ocen<1.51){
            System.out.println("Musisz wziąć się za nauke bo nie zdasz");
        } else if (srednia_ocen>1.51) {
            System.out.println("Udaje ci sie zdać");

        }

    }
}
