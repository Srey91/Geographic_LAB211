/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84898
 */
public class Country {
    protected String countryCode;
    protected String courntryName;
    protected float totalArea;

    public Country() {
    }

    public Country(String countryCode, String courntryName, float totalArea) {
        this.countryCode = countryCode;
        this.courntryName = courntryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCourntryName() {
        return courntryName;
    }

    public void setCourntryName(String courntryName) {
        this.courntryName = courntryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    @Override
    public String toString() {
        return "countryCode=" + countryCode + ", courntryName=" + courntryName + ", totalArea=" + totalArea;
    }
}
