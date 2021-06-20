package org.example.ex42;

import java.util.ArrayList;

public class Parsing_File {
   private static String output = "";
    public String FormattingString(ArrayList<String> dataList) {

        if(dataList == null || dataList.isEmpty())
        {
            output = "Datalist is NULL";
            return output;
        }


        for(int x = 0; x< dataList.size();x++)
        {

            //Size of spaces = 10-length of word until comma
            makeSpaces(dataList.get(x).length(),dataList.get(x));

        }
        return output;
    }

    private String makeSpaces(int length, String s) {
        //Goes threw the specific element in the Array list until it finds a comma and replaces it with a certan amount of spaces
        int counter = 0;
        int totalCharScaned = 0;
        int comma_counter = 0;
        String temp = "";
        String spaces = "";
        for(int q = 0; q < length ;q++)
        {
            if(s.charAt(q) == ',')
            {
                counter = 10-counter;
              // System.out.println(counter);
                for(int x = 0; x<counter;x++)
                {
                    spaces += " ";
                }
                output += (temp + spaces);
                //reset valse
                temp = "";
                spaces = "";
                counter = 0;
                comma_counter++;
                totalCharScaned++;
            }
            else
            {
                if(comma_counter == 2)
                {
                    temp = "";

                    while(totalCharScaned != length)
                    {
                        temp += s.charAt(totalCharScaned);
                        totalCharScaned++;
                    }

                    output += (temp + "\n");
                    return output;
                }
                temp += s.charAt(q);
                counter++;
                totalCharScaned++;
            }

        }

        return "";
    }


}
