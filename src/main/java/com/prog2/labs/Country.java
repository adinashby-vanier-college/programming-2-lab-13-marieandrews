/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author marie
 */
public class Country implements Comparable<Country>{
    
    private String name;
    private int code;
    private int population;
    
    public Country(){
        this.name = "";
        this.code = 0;
        this.population = 0;
    }
    
    public Country(String name, int code, int population){
        this.name = name;
        this.code = code;
        this.population = population;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getCode(){
        return this.code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public int getPopulation(){
        return this.population;
    }
    
    public void setPopulation(int population){
        this.population = population;
    }
    
    @Override
    public int compareTo(Country country){
        return country.population - this.population;
        
    }
    
    @Override
    public String toString(){
       
        String string = "";
        string = this.name + " " + this.code + " " + this.population + "\n";
       return string;
   }
    
    public int hashCode(){
        return name.hashCode() * code * population;
    }
}
