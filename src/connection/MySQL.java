package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySQL {
private static Connection connection;

public static void createConnection(){

    try {
      
        if (connection == null) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_system","root","Nilakshi@22");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static ResultSet executeSearch(String query) throws Exception{

    createConnection();
    return connection.createStatement().executeQuery(query);


}

public static Integer executeNINUPDE(String query) throws Exception{

    createConnection();
    return connection.createStatement().executeUpdate(query);


}
}
