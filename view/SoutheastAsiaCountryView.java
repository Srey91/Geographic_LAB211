/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Collections;
import model.SoutheastAsiaCountry;
import model.SoutheastAsiaCountryList;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class SoutheastAsiaCountryView {
    Validation v = new Validation();
    SoutheastAsiaCountryList sacl = new SoutheastAsiaCountryList();
    
    public void input()
    {
        String countryCode = v.getSoutheastAsiaCountryCode(sacl.getCountryList());
        String countryName = v.getString("country name");
        float area = v.getFloat("total area");
        String countryTerrain = v.getString("contry terrain");
        
        SoutheastAsiaCountry country = new SoutheastAsiaCountry(countryTerrain, countryCode, countryName, area);
        sacl.getCountryList().add(country);
        System.out.println("Input successful!!!");
    }
    
    public void output()
    {
        for (SoutheastAsiaCountry country : sacl.getCountryList())
        {
            System.out.println(country.toString());
        }
    }
    
    public SoutheastAsiaCountryList search()
    {
        SoutheastAsiaCountryList search = new SoutheastAsiaCountryList();
        
        if (sacl.getCountryList().isEmpty())
        {
            System.out.println("Southeast asia country list is empty!!!");
        }else
        {
            String name = v.getString("country name");
  
            for (SoutheastAsiaCountry country : sacl.getCountryList())
            {
                if (country.getCourntryName().contains(name))
                {
                    search.getCountryList().add(country);
                }else
                {
                    System.out.println("Country not found!!!");
                }
            }
        }
        return  search;
    }
    
    public void sort(SoutheastAsiaCountryList countryList)
    {
        Collections.sort(countryList.getCountryList(), (SoutheastAsiaCountry c1, SoutheastAsiaCountry c2) -> 
                c1.getCourntryName().compareTo(c2.getCourntryName()));
        
        for (SoutheastAsiaCountry country : sacl.getCountryList())
        {
            System.out.println(country.toString());
        }
    }
}
