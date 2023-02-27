package Student_Managment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class test_stud {
    public static void main(String[] args) {
        // Create file
        /*try{
            File myfile=new File("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\test.txt");
            if(myfile.createNewFile()){
                System.out.println("File Created Successful");
            }
            else{
                System.out.println("File already Exists");
            }
        }
        catch (Exception e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }*/
//          Write into the file

       /* String fistName,lastName,age,gpa,department;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Fist Name");
        fistName=scan.nextLine();
        System.out.println("Enter your Last Name");
        lastName=scan.nextLine();
        System.out.println("Enter your Age");
        age=scan.nextLine();
        System.out.println("Enter your GPA");
        gpa=scan.nextLine();
        System.out.println("Enter your Department");
        department=scan.nextLine();*/
        /*
        for(int i=1;i<40;i++) {
            try {
                FileWriter myfile = new FileWriter("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\test.txt", true);
//            myfile.write("First_Name\t\tLast_Name\t\tAge\t\tGPA\t\tDepartment\n");
                myfile.write(i + "Nahom\t\tAbraham\t\t21\t\t3.21\t\tSoftware\n");
                //myfile.append(fistName).append("\t\t\t").append(lastName).append("\t\t\t").append(age).append("\t\t").append(gpa).append("\t\t").append(department).append("\n");
                myfile.close();
            } catch (Exception e) {
                System.out.println("Error Occurred");
                e.printStackTrace();
            }
        }*/

//  Read the whole file
       /* try {
            File myfile = new File("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\test.txt");
            Scanner scan = new Scanner(myfile);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        }
        catch (Exception e) {
            System.out.println("Filed");
            e.printStackTrace();
        }*/
//      Read  a specific line
        int n=14;
        String line;
        try(Stream<String >lines= Files.lines(Path.of("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\test.txt"))){
            line=lines.skip(n).findFirst().get();
            System.out.println(line);
        }
        catch (IOException e){
            System.out.println(e);
        }




// end
        }
    }

