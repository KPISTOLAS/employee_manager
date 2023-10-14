import java.io.FileWriter;
import java.io.IOException;

public class Insert {
    
    private String name;
    private int code;
    private int age;
    private String job;
    private int salary;
    private String filePath;

public  Insert (String name, int code, int age, String job, int salary , String filePath){
    this.name = name;
    this.code = code;
    this.age = age;
    this.job = job;
    this.salary = salary;
    this.filePath = filePath;
}
public void saveDataToFile() {
    try (FileWriter writer = new FileWriter(filePath)) {
        writer.write("Name: " + name + "\n");
        writer.write("Code: " + code + "\n");
        writer.write("Age: " + age + "\n");
        writer.write("Job: " + job + "\n");
        writer.write("Salary: " + salary + "\n");
        System.out.println("Data saved to file: " + filePath);
    } catch (IOException e) {
        System.err.println("Error saving data to file: " + e.getMessage());
    }
}

}
