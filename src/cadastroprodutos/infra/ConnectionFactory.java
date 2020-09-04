package cadastroprodutos.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String DRIVER = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/cadastroprodutos";
    private String USER = "root";
    private String PASS = ""; // alterar senha.

    public Connection obterConexao() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
}
