/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BorrowDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author User
 */
public interface BorrowService extends SuperService{
    public String record(BorrowDto borrowDto)throws Exception;
}
