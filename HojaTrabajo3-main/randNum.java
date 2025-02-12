// El programa genera un archivo con un numero aleatorio
import java.io.FileWriter;
import java.io.PrintWriter;

public class randNum {

    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 100);//numero de 0 a 100
        try(FileWriter fileWriter = new FileWriter("randNum.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);) {
            printWriter.println(randNum);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}