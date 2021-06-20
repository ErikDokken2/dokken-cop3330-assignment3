package org.example.ex41;

import java.util.ArrayList;
import java.util.Collections;

public class OrganizeArrayList {
    //organizes using Collections.sort
    public ArrayList<String> OrganizeNames(ArrayList<String> names) {

            //ArrayList<String> namesOrganized = new ArrayList<String>();
            Collections.sort(names);
            //System.out.println(names);
            return names;
        }
    }





