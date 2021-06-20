package org.example.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

//Make a tree map based off of given input file
public class MakeTreeMap {
    public TreeMap<String, Integer> mapMakeTree(String myFile, TreeMap<String, Integer> wordNum) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(myFile));
        while(scan.hasNext()){
            String word = scan.next();
            Integer count = wordNum.get(word);
            if(count == null)
            {
                count = 1;
            }
            else
                count++;
            wordNum.put(word,count);
        }
        scan.close();
        //System.out.println(wordNum);
        return wordNum;
    }
}
