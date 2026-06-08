package app;
import entities.ExerciseNumbers;
import utils.UtilsNumbers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] randomNumbers = UtilsNumbers.generateRandomArray();
        ExerciseNumbers exerciseNumbers = new ExerciseNumbers(randomNumbers);
        System.out.println("Array iniziale:");
        UtilsNumbers.printArray(exerciseNumbers.getNumbers());

        int value;
        do {
            try {
                System.out.print("Inserisci un valore (0 per terminare): ");
                value = scanner.nextInt();
                if (value == 0) {
                    break;
                }
                System.out.print("Inserisci la posizione (0-4): ");
                int position = scanner.nextInt();
                exerciseNumbers.setValue(position, value);
                System.out.println("Nuovo array:");
                UtilsNumbers.printArray(exerciseNumbers.getNumbers());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore della posizione non valida");
            } catch (InputMismatchException e) {
                System.out.println("Errore devi inserire un numero intero");
                scanner.nextLine();
            }
        } while (true);

        System.out.println("Programma terminato");
        scanner.close();
    }
}