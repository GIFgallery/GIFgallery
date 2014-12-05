import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class DatabaseConnection {

    private MysqlDataSource database;
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;

    public DatabaseConnection(){
        database = new MysqlDataSource();
        
        database.setDatabaseName("gif_gallery");
        database.setServerName("localhost");
        database.setPort(Integer.parseInt("3306"));
        database.setUser("root");
        database.setPassword("");
        
        try {
            connection = database.getConnection();
        } catch (SQLException e) {
            System.err.println("Es konnte keine Verbindung zur Datenbank aufgebaut werden!");
            //System.exit(1);
        }
    }

    public ResultSet sendQuery(String query){
        try {
        	
            statement = connection.createStatement();
            resultset = statement.executeQuery(query);
            
            return resultset;
        } catch (SQLException e) {
        	
        	System.out.println("Exception SendQuery " + e.toString());
            e.printStackTrace();
            
            
            return null;
        }
    }
    // for insert/update/delete
    public void sendUpdate(String query){
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void finalize(){
        try {
            connection.close();
            
            System.out.println("DB Connection closed");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

