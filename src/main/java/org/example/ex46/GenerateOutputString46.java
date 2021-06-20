package org.example.ex46;
import java.util.Map;


public class GenerateOutputString46 {

    public String GenerateOutput(Map<String, Integer> wordNum) {

        //Makes Calls for Key
        String output  = "";


        String keySet[] = ((wordNum.keySet())).toArray(new String[0]);
        Integer[] countSet = ((wordNum.values().toArray(new Integer[0])));

        //Determines MaxNumber of " " needed for Output
        int Maxspace = SpaceCount(keySet);
        for(int x = 0; x < wordNum.size();x++)
        {
            output += keySet[x] + ":";

            int total_Spaces = Maxspace - keySet[x].length() +1;
            for(int z = 0; z < total_Spaces; z++)
            {
                output += " ";
            }

            int y = 0;
            while(countSet[x] > y)
            {
                output += "*";
                y++;
            }
            output += "\n";
        }
        return output ;
    }
    //Calculates the amount of spaces
    private int SpaceCount(String[] keySet) {
        int max = 0;
        for(int x = 0; x < keySet.length;x++)
        {
            if (max < keySet[x].length())
            {

                max = keySet[x].length();
                //System.out.println(max);
            }
        }

        //System.out.println(max);
        return max;
    }


}
