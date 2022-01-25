package lesson18;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileLineCopier {
    public static void main(String[] args) {
        try (
                InputStream is = FileLineCopier.class.getResourceAsStream("/lesson18/file.txt");
                InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(streamReader)
        ) {
            int i = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                saveOneFile("file" + i++ + ".txt", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Файл сохраняется в проекте
    private static void saveOneFile(String fileName, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();
    }
}
