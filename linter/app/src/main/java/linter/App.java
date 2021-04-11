/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public  String reading(String fileName) {
        Path path = Paths.get("..", fileName);
//        System.out.println(path.toAbsolutePath());
        try (BufferedReader reader = Files.newBufferedReader(path);) {
            String line = reader.readLine();
            int linNum = 1;
            String output = "";
            while (line != null) {
                output += lint(line, linNum);
                line = reader.readLine();
                linNum++;
            }
            return output;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    public String lint(String line, int linNum) {
        Pattern pattern = Pattern.compile("(.*((if)|(else).*)|([;{}])\s*$)|(^\s*$)");
        Matcher m = pattern.matcher(line);
        boolean found = m.find();
        if (!found) {
            return "Line " + linNum + ": Missing semicolon.\n";
        }
        return "";
    }


    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.reading("linter/gates.js")); // to run from IDE
//        System.out.println(app.reading("gates.js")); // to run from CLI


    }

}


