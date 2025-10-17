/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constants;

import java.sql.PreparedStatement;


/**
 *
 * @author M2200478
 */
public class SQLConstants {
    public static final String URL = "jdbc:sqlite:src/database/database.db";
    
    public static final String INSERT = "INSERT INTO Books(ISBN, Title, author, Format, State) VALUSES (?,?,?,?,?);";
    public static final String FIND_BY_ISBN = "SELECT ISBN, Title, author, Format, State FROM Books WHERE isbn = ?;";
    public static final String FIND_ALL = "SELECT ISBN, Title, author, Format, State FROM Books;";
    public static final String UPDATE = "UPDATE Books SET Title =?, SET author =?, SET Format =?, SET State =? WHERE ISBN =?;";
    public static final String DELETE = "DELETE FROM Books WHERE ISBN =?;";
//    The question marks above are placeholders to be set later
    
//    Examople how to use
//      PreparedStatement pstmt = connection.preparedStatement(SQLConstants,INSERT);
   
}
