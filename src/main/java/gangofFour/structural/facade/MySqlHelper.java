package gangofFour.structural.facade;

import java.sql.Connection;

/**
 * Created by nguyen on 10/7/2016.
 */
public class MySqlHelper {

  public static Connection getMySqlDBConnection() {
    //get MySql DB connection using connection parameters
    return null;
  }

  public void generateMySqlPDFReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }

  public void generateMySqlHTMLReport(String tableName, Connection con) {
    //get data from table and generate pdf report
  }
}
