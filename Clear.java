

import java.io.FileWriter;
import java.io.IOException;

public class Clear {
    
    public Clear ( String filePath)   {
        
        

            try (// Create a FileWriter with append mode set to false (which clears the file)
            FileWriter fileWriter = new FileWriter(filePath, false)) {
                // Close the FileWriter to ensure changes are saved
                fileWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

}
}
