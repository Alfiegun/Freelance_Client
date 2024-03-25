/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Jeevani Gunasekera
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.print(get_Doors());
    }
    
    /**
     * @Author Alfred Gunasekara
     * @Input Keyboard input integer
     * Base Algorithm: 
     * @return String containing open and closed Door values
     */
 public static String get_Doors()
 {
  System.out.print("How many Doors?");
  Scanner keyboard = new Scanner(System.in);
  int Doors_num = keyboard.nextInt();
 //Set up all necessary variables for Hotel object structure
  int iterator = 2;
 //int Doors_init = ((Doors_num +1)/2);
  int counter = 0;
  int counter_closed;
  String Doors_open = "The number of Doors open are : ";
  String Doors_closed = "the number of Doors closed are: ";
  int[] Doors = new int[Doors_num];
 
 //Initialize all doors as open up till n when First guest opens
    for(int i =0; i <= Doors_num-1;i++)
        {
             Doors[i] = 1;
        }
 
 // All behavior beyond this is from 
 //Main algorithm for swapping doors is inside while loop
// Door 2 to n is swapping doors at iteration position
    while(iterator <= Doors_num)
        {
            for(int j = iterator-1; j <= Doors_num-1; j+=iterator)
                {
                    if(Doors[j]==1)
                        {
                            Doors[j] = 0;
                        }
         //else if isn't necessary but I needed to add to make it look
         //concrete logically for readability
                    else if(Doors[j]==0)
                        {
                            Doors[j]=1;
                        }
                }
        //After the for loop changing doors, increase door number
            iterator++;
        }
 
 
 //Summing the open doors
    for(int k =0;k <= Doors_num-1; k++)
        {
            if(Doors[k]==1)
             {
                counter++;
             }
        }
 
 //Finding the inverse of open doors
    if(Doors_num >= counter)
        {
            counter_closed = (Doors_num-counter);
        }
    else
        {
            counter_closed = (counter-Doors_num);
        }
 
 return Doors_open + counter + " "+ Doors_closed + counter_closed;
}
 
}
