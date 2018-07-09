/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EVAN
 */
public class StudyDoctorDatabaseManager {

    static Connection con;
        
    /**
     * This method returns a connection to the study doctor database.
     *
     * @return
     * @throws ClassNotFoundException
     */
    public static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\kolis\\Documents\\NetBeansProjects\\StudyDoctor\\Database\\StudyDoctor.sqlite");
        return con;
    }

    public static void disconnect() throws SQLException {
        con.close();
    }

   
}
