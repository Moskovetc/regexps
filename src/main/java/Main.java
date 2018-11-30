import java.io.IOException;

public class Main {
    private final static String inputFilePath = "input.txt";
    private final static String outputFilePath = "output.txt";
    private final static String regexp = "\\+\\d\\([\\d]{3}\\) [\\d]{3} [\\d]{2} [\\d]{2}";

    public static void main(String[] args) {
        FileParser parser = new FileParser();
        try {
            parser.parse(inputFilePath, outputFilePath, regexp);
        } catch (IOException e) {
            System.err.println(String.format("file %s not exist", inputFilePath));
        }
    }
}
