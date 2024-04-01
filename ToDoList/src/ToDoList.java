import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz opcje");
            System.out.println("1 : Dodaj");
            System.out.println("2 : Usuń");
            System.out.println("3 : Pokaz mi moje zadania");
            System.out.println("4 : Zapisz do Pliku");

            int x = scanner.nextInt();
            scanner.nextLine();

            if (x == 1) {
                for (int i = 0; i < 1; i++) {
                    System.out.println("Wpisz zadanie.");
                    String element = scanner.nextLine();
                    lista.add(element);
                }
            }

            if (x == 2) {
              for(int i=0; i<1; i++){
                  System.out.println("Wpisz które zadanie chciałbys usunąć");
                  for(String elem : lista){
                      System.out.println(elem);
                  }
                  int element = scanner.nextInt();
                  scanner.nextLine();
                  lista.remove(element-1);
              }
            }

            if (x == 3) {
                System.out.println("To twoje zadania");
                for (String elem : lista) {
                    System.out.println(elem);
                }
            }
            if( x== 4){
                try {
                    FileWriter fileWriter = new FileWriter("ToDo.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(String.valueOf(lista));
                    bufferedWriter.close();
                    System.out.println("Dane zostały zapisane do pliku.");
                } catch (IOException e) {
                    System.out.println("Wystąpił błąd podczas zapisywania danych do pliku.");
                    e.printStackTrace();
            }
        }}
    }
}
