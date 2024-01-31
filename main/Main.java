/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManageEastAsiaCountries;
import view.SoutheastAsiaCountryView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        SoutheastAsiaCountryView sacv = new SoutheastAsiaCountryView();
        ManageEastAsiaCountries meac = new ManageEastAsiaCountries();
        meac.menu(sacv);
    }
}
