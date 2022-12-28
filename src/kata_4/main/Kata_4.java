package kata_4.main;

import kata_4.model.*;
import kata_4.view.*;
import java.util.*;

public class Kata_4 {

    public static void main(String[] args) {
        String fileName = "D:\\NETBEANS\\KATAS OFICIALES\\kata_4\\email.txt";
        
        List<Mail> mailList = new MailListReader().read(fileName);
        
        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        
        histoDisplay.execute();
    }
    
}
