/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class BookEntity {
    
    private String bkCode;
    private String bkDep;
    private String bkAuthor;
    private Integer bkQty;
    private String bkCatCode;

    public BookEntity() {
    }

    public BookEntity(String bkCode, String bkDep, String bkAuthor, Integer bkQty, String bkCatCode) {
        this.bkCode = bkCode;
        this.bkDep = bkDep;
        this.bkAuthor = bkAuthor;
        this.bkQty = bkQty;
        this.bkCatCode = bkCatCode;
    }

    /**
     * @return the bkCode
     */
    public String getBkCode() {
        return bkCode;
    }

    /**
     * @param bkCode the bkCode to set
     */
    public void setBkCode(String bkCode) {
        this.bkCode = bkCode;
    }

    /**
     * @return the bkDep
     */
    public String getBkDep() {
        return bkDep;
    }

    /**
     * @param bkDep the bkDep to set
     */
    public void setBkDep(String bkDep) {
        this.bkDep = bkDep;
    }

    /**
     * @return the bkAuthor
     */
    public String getBkAuthor() {
        return bkAuthor;
    }

    /**
     * @param bkAuthor the bkAuthor to set
     */
    public void setBkAuthor(String bkAuthor) {
        this.bkAuthor = bkAuthor;
    }

    /**
     * @return the bkQty
     */
    public Integer getBkQty() {
        return bkQty;
    }

    /**
     * @param bkQty the bkQty to set
     */
    public void setBkQty(Integer bkQty) {
        this.bkQty = bkQty;
    }

    /**
     * @return the bkCatCode
     */
    public String getBkCatCode() {
        return bkCatCode;
    }

    /**
     * @param bkCatCode the bkCatCode to set
     */
    public void setBkCatCode(String bkCatCode) {
        this.bkCatCode = bkCatCode;
    }

    @Override
    public String toString() {
        return "BookEntity{" + "bkCode=" + bkCode + ", bkDep=" + bkDep + ", bkAuthor=" + bkAuthor + ", bkQty=" + bkQty + ", bkCatCode=" + bkCatCode + '}';
    }
    
    
}
