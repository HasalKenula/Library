/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse;

import edu.ijse.view.BookView;
import edu.ijse.view.CategorieView;
import edu.ijse.view.MemberView;

/**
 *
 * @author User
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MemberView().setVisible(true);
        new CategorieView().setVisible(true);
        new BookView().setVisible(true);
    }
    
}
