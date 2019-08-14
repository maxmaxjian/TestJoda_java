import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

public class Solution {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        System.out.println(String.format("Now is %d, %s", now.getMillis(), now.toString(DateTimeFormatter.)));
    }

}
