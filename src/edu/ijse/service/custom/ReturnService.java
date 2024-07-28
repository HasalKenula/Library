/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.ReturnDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author User
 */
public interface ReturnService extends SuperService {
     public String record(ReturnDto returnDto) throws Exception;
}
