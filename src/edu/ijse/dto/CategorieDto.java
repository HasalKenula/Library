/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class CategorieDto {
    private String catCode;
    private String catDep;

    public CategorieDto() {
    }

    public CategorieDto(String catCode, String catDep) {
        this.catCode = catCode;
        this.catDep = catDep;
    }

    /**
     * @return the catCode
     */
    public String getCatCode() {
        return catCode;
    }

    /**
     * @param catCode the catCode to set
     */
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    /**
     * @return the catDep
     */
    public String getCatDep() {
        return catDep;
    }

    /**
     * @param catDep the catDep to set
     */
    public void setCatDep(String catDep) {
        this.catDep = catDep;
    }

    @Override
    public String toString() {
        return "CategorieDto{" + "catCode=" + catCode + ", catDep=" + catDep + '}';
    }
    
    
}
