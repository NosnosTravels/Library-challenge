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

//staff, libary, users

public class CreateTables {

    public static void BookTable() {
        var URL = "jdbc:sqlite:src/database/database.db";
        
        // SQL statement for creating a new table
        var sql = "CREATE TABLE IF NOT EXISTS Book ("
                + "	id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "	Title text NOT NULL,"
                + "     Author text NOT NULL,"
                + "     ISBN INT NOT NULL,"
                + "	capacity INT,"
                + "     State text NOT NULL,"
                + "     Format text NOT NULL"
                + ");";
//connection to db in the try catch
        try (var conn = DriverManager.getConnection(URL);
             var stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void MemberTable() {

        // SQL statement for creating a new table
        var sql = "CREATE TABLE IF NOT EXISTS Members ("
                + "	memberID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "	Fist_Name text NOT NULL,"
                + "     Last_Name text NOT NULL,"
                + "     DoB text NOT NULL,"
                + "	phone_number text CHECK(phone_number is NOT NULL OR LENGTH(phone_number) ==11),"
                + "     email text NOT NULL,"
                + "     Books_borrowed text NOT NULL"
                + ");";
//connection to db in the try catch
        try (var conn = DriverManager.getConnection(URL);
             var stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
  public static void StaffTable() {

        // SQL statement for creating a new table
        var sql = "CREATE TABLE IF NOT EXISTS staff ("
                + "	StaffID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "	Fist_Name text NOT NULL,"
                + "     Last_Name text NOT NULL,"
                + "     DoB text NOT NULL,"
                + "	phone_number text CHECK(phone_number is NOT NULL OR LENGTH(phone_number) ==11),"
                + "     email text NOT NULL,"
                + "     Address1 text NOT NULL,"
                + "     Address2 text NOT NULL,"
                + "     Town text NOT NULL"
                + ");";
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
