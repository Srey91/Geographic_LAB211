/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84898
 */
public class SoutheastAsiaCountry extends Country{
    private String countryTerrain;

    public SoutheastAsiaCountry() {
    }

    public SoutheastAsiaCountry(String countryTerrain, String countryCode, String courntryName, float totalArea) {
        super(countryCode, courntryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return super.toString() +"countryTerrain=" + countryTerrain;
    }
}
