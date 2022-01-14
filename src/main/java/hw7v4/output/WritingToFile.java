package hw7v4.output;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public void file(String text) throws IOException {
        FileWriter writer = new FileWriter("src\\main\\java\\hw7v4\\Результаты.txt", false); //каждый раз перезаписывает файл
        writer.write(text); //метод записывающий указанный текст в файл
        writer.close(); //закрыть поток
    }

    public static void main(String[] args) throws IOException {
        WritingToFile test = new WritingToFile();
        test.file("Line");
    }
}