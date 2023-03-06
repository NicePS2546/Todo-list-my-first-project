package asssets;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class list_todos {
       Scanner input = new Scanner(System.in);
       public String[] todo_list={"shower","coding","traing coding in website","play game","reading","eat something","reading Manhwa,manga"};
       public ArrayList<String> holiday = new ArrayList<>();
       int size = todo_list.length;

       Random rand = new Random();
       int spin = rand.nextInt(size);
       

       public void add_holiday(){
       holiday.add(input.nextLine());

       
       }

       

}
