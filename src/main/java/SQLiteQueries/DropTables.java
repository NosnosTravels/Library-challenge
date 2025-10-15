/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLiteQueries;

import static Constants.SQLConstants.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author M2200478
 */
public class DropTables {
        public static void dropAllTables(){
        // SQL statement for dropping tables
        var sql = "	DROP TABLE Book;"
                + "	DROP TABLE Members;"
                + "	DROP TABLE Staff;"
                + "	DROP TABLE Libary;"
                + "	DROP TABLE Borrowed_Books;";
//connection to db in the try catch
        try (var conn = DriverManager.getConnection(URL);
             var stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
                
    }
}
