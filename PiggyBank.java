/**
 * For chapter 7 sorting
 * @author CPM 2018
 * @version 2/4/06 mods 2/16/09, 1/27/18
 */
import java.util.ArrayList;
import java.util.Random;

public class PiggyBank{

    private ArrayList<Coin> myPiggyBankList; //this listlist holds the Coin objects
    private String myContentsStr;//for displaying bank contents

    //constructor
    public PiggyBank()
    {
        myPiggyBankList = new ArrayList<Coin>();
        this.bankContents();//update myContentsStr
    }
    
    /** 
     * Preconditon: Recieves valid Coin object reference from client
     * Postcondition: Adds Coin to instance ArrayList 
     * 
     * @param  x   an object reference of type Coin   
     * @return     instance String of ArrayList contents 
     * 
     * Do Not Modify
     */
    public String addMoney(Coin x)
    {
        myPiggyBankList.add(0,x);//put coin at (0)
        this.bankContents();//update myContentsStr
        return myContentsStr;
    }
    
    /** 
     *  Searches ArrayList for Coin of the same value
     *  
     *  Precondition: Recieves valid Coin object reference from client 
     *  Postcondition: Updated instance String of ArrayList contents
     * 
     * @param  x   an object reference of type Coin   
     * @return     instance String of ArrayList contents 
     * 
     */
    public String removeMoney(Coin x)
    {
        //Complete this method 

        
        this.bankContents();//update myContentsStr
        
        return "Complete the removeMoney() method\n";
    }
    
    /** 
     *  Postcondition: Performs an ascending sort on the ArrayList contents
     *    according to the compareTo method of Coin.
     * 
     *  Demonstrates the use of BOTH the Selection and Insertion sort 
     *    implementations for ArrayLists.
     *  
     *  Randomly chooses which sorting method to use.
     *  (Not necessary for a functional program)
     *  
     *  Appropriate line comments within the implementation are given
     *  Fill in the corresponding code beneath line comments #1 - 5 
     *      so the program behaves identically to the PiggyBank_Demo project.
     *  The required code is shown in a block comment below the sortMoney method
     *    in no particular order.
     */
    public String sortMoney()
    {
       Random rand = new Random();
       
       //Randomly chooses which sorting method to use.
       if(rand.nextBoolean())
       
       {// SELECTION Sort
          int minIndex;
          // Search the unsorted part of the list repeatedly until the entire list is sorted.
          for (int scanNum = 0; scanNum < myPiggyBankList.size() - 1; scanNum++)
          {
             minIndex = scanNum;
             // 1.  Search for the smallest element in the unsorted portion of the list.
            
             
             
             // 2. Swap the smallest element with the first element in the unsorted part of the list.
             
             
             
          }
       }
       
       else
       
       {// INSERTION Sort
          Coin obj;
          int insertIndex;
          // Search the unsorted part of the list repeatedly until the entire list is sorted.
          for( int scanNum = 1; scanNum < myPiggyBankList.size(); scanNum++)
          {
             // 3. Make a local reference to the first object in the unsorted portion of the list. 
             //       The list now has an available space.
             
             
             
             // 4. Move the sorted elements into the available space one at a time until:
             //       the available space reaches the start of the array OR
             //       the next sorted element is smaller than the local object.
             
             
             
             // 5. Put the local object reference in the available space.
             
                          
                          
          }
       }   
      
       this.bankContents(); //update the myContentsStr
       
       return "Complete the sortMoney() method\n";
    }
    
    /* CHOOSE FROM THESE CODE STATEMENTS:
     * 
     * myPiggyBankList.set(insertIndex, obj);
     * 
     * 
     * obj = myPiggyBankList.get(scanNum);
     * insertIndex = scanNum;
     * 
     * 
     * for(int index = scanNum + 1; index < myPiggyBankList.size(); index++)
     *    if ( myPiggyBankList.get(index).compareTo(myPiggyBankList.get(minIndex)) < 0)
     *         minIndex = index;
     * 
     * 
     * while(insertIndex > 0 && myPiggyBankList.get(insertIndex - 1).compareTo(obj) > 0) {
     *       myPiggyBankList.set(insertIndex, myPiggyBankList.get(insertIndex-1));
     *       insertIndex--;
     *    }
     * 
     *
     * Coin temp = myPiggyBankList.get(scanNum);
     * myPiggyBankList.set(scanNum, myPiggyBankList.get(minIndex));
     * myPiggyBankList.set(minIndex, temp);
     */
    
    
    /**
     *  Private Helper Method
     *  Builds the string that shows the Piggybank contents. 
     * 
     * Do Not Modify
     */
    private void bankContents()
    {   double total$ = 0;
        if(myPiggyBankList.size() == 0) 
                myContentsStr = "The Coin Purse is Empty";
        else
        {
            myContentsStr = "";
            for (int x = 0; x < myPiggyBankList.size(); x++)
            {
                myContentsStr += " $" +(myPiggyBankList.get(x)).getValue() + 
                    " \t" + (myPiggyBankList.get(x)).getName() + "\n";
                total$ += (myPiggyBankList.get(x)).getValue();
            }
            total$ = (Math.round(total$ * 100))/100.0;  //clean up trailing decimals.
            myContentsStr += "For a total value of $" + total$;
        }              
    }    
}
