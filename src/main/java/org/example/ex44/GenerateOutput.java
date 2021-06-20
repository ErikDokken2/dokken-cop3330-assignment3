package org.example.ex44;

import java.util.ArrayList;

public class GenerateOutput {

private static int keyNum = 0;
    public boolean FindKey(ArrayList<String> nameList, String nameKey) {
        String temp = "";
        //System.out.println(nameList);
        for (int x =0;x <nameList.size();x++) {
            temp = nameList.get(x);

            if (nameKey.equals(temp))
            {
                keyNum = x;
                return true;
            }

        }

        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }

    public String OutputString(ArrayList<String> nameList, ArrayList<String> priceList, ArrayList<String> quantityList) {
        String output = "Name: " + nameList.get(keyNum) + "\nPrice: " + priceList.get(keyNum) + "\nQuantity: "+ quantityList.get(keyNum);

        return output;
    }
}
