/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.Comparator;

/**
 *
 * @author marie
 */
public class CodeComparator implements Comparator<Country>{
    
    @Override
    public int compare(Country country1, Country country2){
        return (country1.getCode() - country2.getCode());
    }
}
