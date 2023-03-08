package asssets;


public class Assembly {
        busy_day busy_day_check = new busy_day(false);
        boolean check_busy = busy_day_check.busy_check;

        holiday_check holi_check = new holiday_check(false);
        boolean check_holiday = holi_check.holidaycheck;

        
    public Assembly(){
        
        System.out.println("\n"+"Holiday checking....."+"\n");

        if(check_busy == true && check_holiday == false){
            System.out.println("Sad you didnt have a holiday.");
            System.out.println("Welp go to school then, see ya!");
        }else{
            System.out.println("Congrate you have a holiday");
            System.out.println("Welp try out your luck then!");
             System.out.println("Here it come : "+holi_check.list_of_var.todo_list[holi_check.list_of_var.spin]+"!");
            
        }

       

    }
}
