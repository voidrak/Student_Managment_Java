package Student_Managment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class stud_register extends main_stud {
 void register() throws IOException {
    String fistName, lastName, age, gpa, department;
    int count=0;
    System.out.println("Welcome to RAK Student Management Program");
    System.out.println("Enter your Information Properly as asked below ");
    System.out.println("** Click Enter to Continue");
    System.in.read();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Fist Name");
    fistName = scan.nextLine();
    System.out.println("Enter your Last Name");
    lastName = scan.nextLine();
    System.out.println("Enter your Age");
    age = scan.nextLine();
    System.out.println("Enter your GPA");
    gpa = scan.nextLine();
    System.out.println("Enter your Department");
    department = scan.nextLine();

    try {
        FileWriter mywriter = new FileWriter("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\stud_database.txt", true);
        mywriter.append(fistName).append("\t\t\t").append(lastName).append("\t\t\t").append(age).append("\t\t").append(gpa).append("\t").append(department).append("\n");
        System.out.println("You Have Successfully Registered");
        mywriter.close();
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error Occurred");
    }
    try {
        File filecount = new File("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\stud_database.txt");
        Scanner sc=new Scanner(filecount);
        while (sc.hasNext()){
                sc.nextLine();
                count++;
        }

        System.out.println("Your ID is 00"+count--);
    }
    catch(Exception e){
        e.printStackTrace();
    }

// End
}



}
