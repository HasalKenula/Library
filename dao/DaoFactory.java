/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.impl.MemberDaoImpl;
import edu.ijse.dao.custom.impl.CategorieDaoImpl;
import edu.ijse.dao.custom.impl.BookDaoImpl;
/**
 *
 * @author User
 */
public class DaoFactory {
     private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case MEMBER:
                return new MemberDaoImpl();
            case CATEGORIE:
                return new CategorieDaoImpl();
            case BOOK:
                return new BookDaoImpl();         
            default:
                return null;
        }
    }

    public enum DaoTypes {
        MEMBER, CATEGORIE, BOOK
    }
}
