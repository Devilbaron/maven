package cn.cn.util;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 2017/8/9.
 */
public class SQLTime {
    public SQLTime()
    {

    }
    public static String SQLDateTime()
    {
        Date date = new Date();
        long times = date.getTime();//时间戳
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        System.out.println(dateString);
        return dateString;
    }
}
