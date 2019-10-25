package prova;

import java.sql.*;

public class Conexao
{    
    private Connection conexao;
    private final String URLDB = "jdbc:derby://localhost:1527/banco";
    private final String usuario = "user";
    private final String senha = "password";
    
    public Conexao()
    {
        try
        {
            Class.forName("org.Apache.derby.jdbc.ClientDriver");
            conexao = DriverManager.getConnection(URLDB,usuario,senha);
        }catch (Exception e){e.printStackTrace();}
    }
    public static void main(String[] args)
    {
        Conexao conexao = new Conexao();
    }
    public void inserir()
    {
        try
        {
            Statement insert = conexao.createStatement();
            insert.execute("INSERT INTO nota (id,nome,ra,nota) VALUES (1,'Yuri',148122911463,10)");
        }
        catch (Exception e){}
    }
}
