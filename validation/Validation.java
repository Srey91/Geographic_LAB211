/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.ArrayList;
import java.util.Scanner;
import model.SoutheastAsiaCountry;

/**
 *
 * @author 84898
 */
public class Validation {
    public String getString (String string)
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter " + string  + ": ");
       
       while (true)
       {
            String result = sc. nextLine();
           
           if (result.isEmpty())
           {
               System.out.println(string + " can't empty!!!");
               System.out.println("Enter " + string + " again: ");
           }else 
               return result;
       }
   }
    
    public float getFloat (String string)
   {
       while (true)
       {
           try 
           {
                float number  = Float.parseFloat(getString(string)); 
                if (number > 0)
                    return number;
                else
                    System.out.println("Total area cannot below zero!!!");
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
    
    public String getSoutheastAsiaCountryCode(ArrayList<SoutheastAsiaCountry> list)
   {
        boolean isExist;
        
        while (true) 
        {
            isExist = false;
            String code = getString("country code");//scannerNextLine
            
            for (SoutheastAsiaCountry country: list) 
            {
                if (country.getCountryCode().equals(code)) 
                {
                    System.out.println("Code is existed!!!");
                    isExist = true;
                }
            }
            if(isExist == false) return code;
        }
    }
    
    public int getAnyInteger (String string)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(getString(string)); 
                return number;
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
}
