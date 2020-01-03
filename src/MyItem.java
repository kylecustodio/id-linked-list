/**
 *  Kyle Custodio | kyc180000
 *  CS3345 | Data Structures and Intro to Algorithmic Analysis
 *  Section 001
 *  Fall 2019
 *  Project 2: Takes an input file via command line, performs the instructions as per the file on a LinkedList
 *              and outputs when instructed to to an output file, name chosen via command line.
 */

import java.util.ArrayList;
import java.util.List;

public class MyItem implements IDedObject {
    private int itemID;
    private int priceItem;
    private List<Integer> itemDescription;

    public MyItem(int itemID, int priceItem, List<Integer> itemDescription) {
        this.itemID = itemID;
        this.priceItem = priceItem;
        this.itemDescription = new ArrayList<>();
        for (int i : itemDescription) {
            this.itemDescription.add(i);
        }
    }

    @Override
    public int getID() {
        return itemID;
    }

    @Override
    public String printID() {
        String s = itemID + " " + priceItem + " ";
        for(int i : itemDescription) {
            s += i + " ";
        }
        return s;
    }

}
