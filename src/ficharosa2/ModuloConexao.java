/*
 Este módulo de conexão permite o acesso ao banco de dados do sistema
 */
package ficharosa2;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author DiegoVerly
 */
public class ModuloConexao {
    
    public static Connection conector(){
        
        java.sql.Connection conexao = null;
        
        String driver = "org.firebirdsql.jdbc.FBDriver";
        
        Properties props = new Properties();
        props.setProperty("user", "SYSDBA");
        props.setProperty("password", "masterkey");
        props.setProperty("encoding", "UTF8");
               
                
        try {
            
            Class.forName(driver).newInstance(); //executa o arquivo do driver
            
            conexao = DriverManager.getConnection("jdbc:firebirdsql:192.168.25.74/3050:C:/database/TESTE_DBF.FDB",props);
                                   
            return conexao;             
        } 
        catch (Exception e) {
            
          return null;
          
        }
                         
        }
        
    }