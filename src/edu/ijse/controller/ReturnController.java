/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.ReturnDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.ReturnService;

/**
 *
 * @author User
 */
public class ReturnController {
    
     private ReturnService returnService = (ReturnService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RETURN);
    
    public String record(ReturnDto returnDto) throws Exception{
        return returnService.record(returnDto);
    }
}
