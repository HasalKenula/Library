/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BorrowDao;
import edu.ijse.entity.BorrowEntity;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BorrowDaoImpl implements BorrowDao{

    @Override
    public String save(BorrowEntity t) throws Exception {
        boolean isBorrowSaved = CrudUtil.executeUpdate("INSERT INTO borrow VALUES (?,?,?,?)", t.getBorrowId(), t.getDate(), t.getMemId(),t.getDueDate());
        return isBorrowSaved? "Success" : "Fail";
    }

    @Override
    public String update(BorrowEntity t) throws Exception {
        return null;
    }

    @Override
    public String delete(String id) throws Exception {
         return null;
    }

    @Override
    public BorrowEntity get(String id) throws Exception {
         return null;
    }

    @Override
    public ArrayList<BorrowEntity> getAll() throws Exception {
          return null;
    }
    
}
