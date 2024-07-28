/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BorrowDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BorrowService;

/**
 *
 * @author User
 */
public class BorrowController {
    
    private BorrowService borrowService = (BorrowService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROW);
    public String record(BorrowDto borrowDto)throws Exception{
        return borrowService.record(borrowDto);
    }
    
    
    public String getr (String code) throws Exception{
        return borrowService.getr(code);
    }
}
