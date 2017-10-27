package java_code;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/13.
 */

public class WeekEnd {

    public static boolean isWeekEnd(){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();

        String dayOfTheWeek = sdf.format(d);

        if(dayOfTheWeek.contains("Sat")){
            return true;
        }else if(dayOfTheWeek.contains("Sun")){
            return true;
        }else {
        	return false;
        }
    }
}
