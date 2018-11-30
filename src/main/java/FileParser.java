import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileParser {
    public void parse(String inputFilePath, String outputFilePath, String regexp) throws IOException {
        Pattern pattern = Pattern.compile(regexp);
        Stream<String> streamFromFile = Files.lines(Paths.get(inputFilePath));
        File outputFile = new File(outputFilePath);
        try (PrintWriter writer = new PrintWriter(outputFile)){
            streamFromFile.forEach(line -> {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.println(matcher.group());
                }
            });
        }
    }
}
