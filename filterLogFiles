/*
 * Given a large log file. Each log entry has the date and time and a log message in some simple format(tab-separated: ios8601-time\tmessage).
 * Find all the log messages with timestamps within a specified time range. 
 * Example logline: 2017-08-12T03:22:09Z    Program a executed operation b successfully. 
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LogSearch {

    public Collection<String> search(Collection<String> logLines, LocalTime startDate, LocalTime endDate) { 
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        Iterator<String> iter = logLines.iterator(); //iterate through each log in logLines     
        while(iter.hasNext()) {
            String log = iter.next();
            String[] temp = log.split("\\t"); // get date and time at index 0, split the log message
            LocalTime logTime = LocalTime.parse(temp[0], formatter); //parse string into ISO_DATE_TIME format
            if(logTime.isBefore(startDate) || logTime.isAfter(endDate) || logTime.equals(endDate)) {
               iter.remove(); //remove if LocalTime logTime is not within the specified time range. 
            }
        }
        return logLines; //return all log messages with timestamps within the specified time range. 
    }
    
}
