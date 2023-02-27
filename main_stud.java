package Student_Managment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main_stud {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
       try{
            File myfile=new File("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\stud_database.txt");
            if(myfile.createNewFile()){
                System.out.println("File Created Successful");
                try {
                    FileWriter myfirstwrite = new FileWriter("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\stud_database.txt", true);
                    myfirstwrite.write("First_Name\t\tLast_Name\t\tAge\t\tGPA\t\tDepartment\n");
                    myfirstwrite.close();
                } catch (Exception e) {
                    System.out.println("Error Occurred");
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
        System.out.println("Welcome to RAK Student Management Program");
        System.out.println("Choose the options below");
        System.out.println("1. Register");
        System.out.println("2. View Information");
        int choice= scan.nextInt();
        switch (choice){
            case 1-> {
                stud_register stud_register = new stud_register();
                stud_register.register();
            }
            case 2->{
                stud_view stud_view=new stud_view();
                stud_view.view();
            }
        }




//      end
    }

}
