/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import view.SoutheastAsiaCountryView;

/**
 *
 * @author 84898
 */
public class ManageEastAsiaCountries extends Menu{
    public void menu(SoutheastAsiaCountryView sacv)
    {
        String[] content = {"Input Southeast Asia Country", "Display", "Search", "Exit"};
        Menu m = new Menu("Geographic", content) {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: sacv.input(); break;
                    case 2: sacv.output();break;
                    case 3: sacv.search(); break;
                }
            }
        };      
        m.run();
    }

    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
