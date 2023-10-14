import java.io.File;
import java.io.IOException;

public class CreateFileWithVariableName {
    public CreateFileWithVariableName  (String variableFileName ) {
        

        try {
            File file = new File(variableFileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
