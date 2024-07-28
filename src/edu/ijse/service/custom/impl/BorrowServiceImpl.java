/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dao.custom.BorrowDao;
import edu.ijse.dao.custom.BorrowDetailDao;
import edu.ijse.db.DBConnection;
import edu.ijse.dto.BorrowDetailDto;
import edu.ijse.dto.BorrowDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.entity.BorrowDetailEntity;
import edu.ijse.entity.BorrowEntity;
import edu.ijse.service.custom.BorrowService;
import java.sql.Connection;


/**
 *
 * @author User
 */
public class BorrowServiceImpl implements BorrowService {
    
    private BorrowDao borrowDao=(BorrowDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROW);
    private BorrowDetailDao borrowDetailDao = (BorrowDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROW_DETAIL);
    private BookDao bookDao=(BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String record(BorrowDto borrowDto) throws Exception {
   
    
   
    
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            
            BorrowEntity borrowEntity = new BorrowEntity(borrowDto.getBorrowId(), borrowDto.getDate(), borrowDto.getMemId(),borrowDto.getDueDate());
            
            String resp = borrowDao.save(borrowEntity);
            if(resp.equals("Success")){
                
                boolean isBorrowDetailSave = true;
                
                for (BorrowDetailDto borrowDetailDto : borrowDto.getBorrowDetailDtos()) {
                    BorrowDetailEntity borrowDetailEntity = new BorrowDetailEntity(borrowDto.getBorrowId(),
                            borrowDetailDto.getBkCode(), borrowDetailDto.getQty());
                           
                    String boResp = borrowDetailDao.save(borrowDetailEntity);
                    if(!boResp.equals("Success")){
                        isBorrowDetailSave = false;
                    }
                }
                
                if(isBorrowDetailSave){
                    boolean isBookUpdated = true;
                    
                    for (BorrowDetailDto borrowDetailDto : borrowDto.getBorrowDetailDtos()) {
                        BookEntity bookEntity = bookDao.get(borrowDetailDto.getBkCode());
                        bookEntity.setBkQty(bookEntity.getBkQty() - borrowDetailDto.getQty());
                        String bookResp = bookDao.update(bookEntity);
                        if(!bookResp.equals("Success")){
                            isBookUpdated = false;
                        }
                    }
                    
                    if(isBookUpdated){
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Book update Error";
                    }
                    
                } else{
                    connection.rollback();
                    return "Borrow Detail Save Error";
                }
                
            } else {
                connection.rollback();
                return "Borrow Save Error";
            }
            
        } catch (Exception e) {
           connection.rollback();
           e.printStackTrace();
           return "Server Error";
        } finally {
            connection.setAutoCommit(true);
        }
    
    
  
   
    }

    @Override
    public String getr(String code) throws Exception {

    String entity = borrowDao.getr(code);
    
    String dto=(entity);
    
    
    return dto;
    }
    
    
}
