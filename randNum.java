import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class randNum {
    // ingresar cantidad de numeros entre 10 y 3000
    public int getNum() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de numeros a generar: ");
            int num = scanner.nextInt();
            scanner.close();
            if (num < 10 || num > 3000) {
                System.out.println("Error: Ingrese un numero entre 10 y 3000");
                getNum();
            } else {
                return num;  
            }
        }
    }
    public void printNum() {
        int cantNums = getNum();
        try (FileWriter fileWriter = new FileWriter("randNum.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (int i = 0; i < cantNums; i++) {
                int ranNum = (int) (Math.random() * 100);// numero de 0 a 100
                printWriter.println(ranNum);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        randNum generator = new randNum();
        generator.printNum();
    }
}