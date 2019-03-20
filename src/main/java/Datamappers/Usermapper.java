
package main.java.Datamappers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import main.java.Util.Connector;

import java.sql.Connection;
import java.sql.SQLException;

public class Usermapper {


    public static Connection dbConnect() {
        Connection connection = null;
        try {
            connection = Connector.connection();
            String sql = "SELECT * FROM test.Test;";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //Hej Josh Branch
}

