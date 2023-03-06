package asssets;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class time_update {
    
    public int day;
    public String dayintext;
    public time_update(int dayOfWeek,String daytext){
        Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        this.day = dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        // System.out.println("Day of week in number:"+dayOfWeek);
        this.dayintext = daytext = new SimpleDateFormat("EEEE").format(date);
        // System.out.println("Day of week in text:"+dayWeekText);
        
    }
}
