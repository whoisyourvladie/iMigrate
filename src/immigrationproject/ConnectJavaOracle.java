package immigrationproject;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectJavaOracle {

   
   static Connection c;
    private static void connectiontoOracle()  {
       

         c = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@ localhost:1521:orcl";
            c = DriverManager.getConnection(url, "scott", "tiger");
            //System.out.println("i'm here");

            

        } catch (Exception ex) {
            try {
                c.rollback();
            } catch (Exception ee) {
                System.out.println("Connectiion error");
                ee.printStackTrace(System.out);
            }

        }
    }
    
    public static void insertUpdateDB(String query, boolean showMessage) {
       
        connectiontoOracle();
         try{
        Statement s = c.createStatement();
             s.executeUpdate(query);
            c.commit();
             closeConnectiontoOracle();
             if (showMessage)
            JOptionPane.showMessageDialog(null,"Entry successfully saved to database","Success",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("insert.error\n"+query);
            e.printStackTrace(System.out);
        }
    }
    
    
    public static ResultSet retreivefromDB(String query){
         connectiontoOracle();
        try{
        Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rset=s.executeQuery(query);
           
            //c.close();
             return rset;
        }catch(Exception e){
            System.out.println("retrieve.error");
            e.printStackTrace(System.out);
        }
        return null;
        
    }
    
    private static void closeConnectiontoOracle()  {
       try {
           c.close();
       } catch (SQLException ex) {
          System.out.println("close.error\n");
            ex.printStackTrace(System.out);
       }
    }
}
