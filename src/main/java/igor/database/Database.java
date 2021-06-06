package igor.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
        
    private static Connection connection = null;

    public static Connection getConnection() {
        if(connection == null) {

            String dbUrl = "jdbc:postgresql://"
            + "localhost" + ":"
            + "5432"
            + "/DS2";

            String username = "postgres";
            String password = "admin";

            try {
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Conectado ao banco de dados com sucesso");
            } catch (SQLException error) {
                System.out.println("Erro ao conectar ao banco de dados");
                error.printStackTrace();
            }



        }
        return connection;
    }
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
