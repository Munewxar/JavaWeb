package filework;

import model.Toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * This class is designed to read data from file
 * and write data to file.
 *
 * @author      Steven Altamirano
 */
public class FileWorker {
    /**
     * This method reads data from file.
     * @param file - file to read.
     * @return - list of file data.
     */
    public static List<String> readFromFile(File file) {
        List<String> readFromFileResult = null;

        try {
            readFromFileResult = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readFromFileResult;
    }

    /**
     * This method writes data to file.
     * @param data - data we want to write.
     * @param file - file to write.
     */
    public static void writeToFile(List<Toy> data, File file) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);

            for (Toy toy : data) {
                fileWriter.write(toy.toString());
            }

            fileWriter.close();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }
}
