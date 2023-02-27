package Student_Managment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class stud_view extends main_stud {
    public  void view (){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome Student Enter your Id to view your information");
        int id= scan.nextInt();
        String line;
        try(Stream<String >lines= Files.lines(Path.of("C:\\Users\\RAK\\CODE\\JAVA\\Simple Projects\\src\\Student_Managment\\stud_database.txt"))){
            line=lines.skip(id).findFirst().get();
            System.out.println(line);
        }
        catch (IOException e){
            System.out.println(e);
        }
// end
    }
}
