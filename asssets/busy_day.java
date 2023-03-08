package asssets;


public class busy_day{
     
        boolean busy_check;
      public busy_day(boolean busy_day){ 
        time_update busy_day_check = new time_update(0,"");
        int get_day = busy_day_check.day;  
        this.busy_check = busy_day;

        if(get_day == 7 || get_day == 1){
            busy_check = false;

        }else{
            
            busy_check = true;
        }
       // System.out.println("busy_check :"+busy_check); //check value busy_check boolean
    }
}