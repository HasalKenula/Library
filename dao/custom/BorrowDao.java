/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.dao.custom;

import edu.ijse.dao.CrudDao;
import edu.ijse.entity.BorrowEntity;

/**
 *
 * @author User
 */
public interface BorrowDao extends CrudDao<BorrowEntity,String> {
   
    
    public String getr(String code) throws Exception;
}
