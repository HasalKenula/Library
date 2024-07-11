/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;

import edu.ijse.service.custom.impl.MemberServiceImpl;
import edu.ijse.service.custom.impl.CategorieServiceImpl;
import edu.ijse.service.custom.impl.BookServiceImpl;
import edu.ijse.service.custom.impl.BorrowServiceImpl;


/**
 *
 * @author User
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
     public SuperService getService(ServiceType type){
        switch (type) {
            case MEMBER:
               return new MemberServiceImpl();
            case CATEGORIE:
                return new CategorieServiceImpl();
            case BOOK:
                return new BookServiceImpl();
            case BORROW:
                return new BorrowServiceImpl();
            default:
                return null;
        }
    }
    
     public enum ServiceType{
        MEMBER, CATEGORIE, BOOK,BORROW
    }
}
