package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "CL-Team";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] numbers = query.split(" ");

            int idx = Arrays.asList(numbers).indexOf("plus");

            int ans = 0;

            ans += Integer.parseInt(numbers[idx-1]);
            ans += Integer.parseInt(numbers[idx+1]);
            
            return String.valueOf(ans);
        }
        return "";
    }
}
