import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    
public static void saveDataToFile(String name, int code, int age, String job, int salary , String filePath) {
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

public static void main(String[] args) {
    System.out.println("Welcome to companies employee manager");
    try (Scanner myObj = new Scanner(System.in)) {
        int an;
        String nameM=" " ;
        int code = -1;
         int age = 0;
         String job = "";
         int salary = -1;
         String filePath;
         boolean flag;
do{
        do{
         System.out.println("Add emploee(1) or  remove employee(2) or exit(0) ");
         an=myObj.nextInt();
        }while(!(an==1 || an==2 || an==0 ));

        if(an==1){
            do{
                flag = false;
                try {
                 System.out.println("Add emploees Name");
                 
                 nameM = myObj.nextLine();

                }
                catch (Exception e) {
                System.err.println("An error occurred");
                flag = true;
            }
            }while(flag);
            
            do{
                flag = false;
                try {
                 System.err.println("Add emploees Code");
                 myObj.nextInt(); // Consume the newline character
                 code = myObj.nextInt();

                }
                catch (Exception e) {
                System.out.println("An error occurred");
                flag = true;
            }
            }while(flag);
            do{
                flag = false;
                try {
                 System.out.println("Add emploees age");
                 myObj.nextInt(); // Consume the newline character
                 age = myObj.nextInt();
                }
                catch (Exception e) {
                System.err.println("An error occurred");
                flag = true;
            }
            }while(flag);
            do{
                flag = false;
                try {
                 System.out.println("Add emploees Job");
                 myObj.nextLine(); // Consume the newline character
                 job = myObj.nextLine();
                }
                catch (Exception e) {
                System.err.println("An error occurred");
                flag = true;
            }
            }while(flag);
            do{
                flag = false;
                try {
                 System.out.println("Add emploees Salary");
                 myObj.nextInt(); // Consume the newline character
                 salary = myObj.nextInt();

                }
                catch (Exception e) {
                System.err.println("An error occurred");
                flag = true;
            }
            }while(flag);
                
            filePath = nameM + ".txt";
            new CreateFileWithVariableName(filePath);
            saveDataToFile(nameM, code, age, job, salary, filePath);

        }
        else if(an==2){
                 do{
                flag = false;
                try {
                 System.out.println("Add emploees Name");
                 myObj.nextLine(); // Consume the newline character
                 nameM = myObj.nextLine();

                }
                catch (Exception e) {
                System.err.println("An error occurred");
                flag = true;
            }
            }while(flag);
            filePath = nameM + ".txt";
            new Clear(filePath);
        }

    }while(an!=0);
    System.out.println("exit");
}


}

}
