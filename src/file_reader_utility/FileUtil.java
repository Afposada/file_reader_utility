package file_reader_utility;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {

	
		/**
		 * Utility class for file management operations.
		 * Designed to provide efficient methods for handling plain text files.
		 * * @author Andres Posada
		 * @version 1.0
		 */


		    /**
		     * Reads all lines from a plain text file and returns them as a List of Strings.
		     * This method uses Java NIO.2 for better performance and resource management.
		     *
		     * @param filePath The absolute or relative path to the text file.
		     * @return A List containing all lines of the file.
		     * @throws IOException If an I/O error occurs reading from the file or a malformed 
		     * or unmappable byte sequence is read.
		     */
		    public static List<String> readTextFile(String filePath) throws IOException {
		        if (filePath == null || filePath.isEmpty()) {
		            throw new IllegalArgumentException("The file path cannot be null or empty.");
		        }

		        Path path = Paths.get(filePath);

		        // Validating if the file exists before attempting to read
		        if (!Files.exists(path)) {
		            throw new IOException("File not found at: " + filePath);
		        }

		        // Reading all lines using UTF-8 encoding
		        return Files.readAllLines(path, StandardCharsets.UTF_8);
		    }

		    /**
		     * Entry point for testing the file reader utility.
		     * * @param args Command line arguments.
		     */
		    public static void main(String[] args) {
		        String samplePath = "data.txt";

		        try {
		            List<String> content = readTextFile(samplePath);
		            System.out.println("--- File Content ---");
		            content.forEach(System.out::println);
		        } catch (IOException | IllegalArgumentException e) {
		            System.err.println("Error reading the file: " + e.getMessage());
		        }
	}

}
