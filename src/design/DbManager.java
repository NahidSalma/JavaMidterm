package design;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DbManager {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

//    public static Properties config = new Properties();
    public static FileInputStream fis;
    public static final String  dataPath = System.getProperty("user.dir")
            + "\\src\\resources\\data.properties";
    static String tableName = "test.employees";
    static String columnName = "FIRST_NAME";

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/resources/data.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Properties loadProperties(String fileName) throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/resources/" + fileName + ".properties");
        prop.load(ism);
        ism.close();
        return prop;
    }





    public static Connection getDbInstance() throws ClassNotFoundException, SQLException, IOException {
        Properties config =loadProperties();

        String url = config.getProperty("MYSQLJDBC.url");
        String user = config.getProperty("MYSQLJDBC.userName");
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Database is connected");
        return connection;
    }


    public static void getTableData(String tableName, String columnName) {

        try {
            Connection connection = getDbInstance();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from " + tableName + ";");

            while ((resultSet.next())) {
                System.out.println(resultSet.getString(columnName));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public static void insertDataIntoTable(int employeeId){
        try {
            Connection connection = DbManager.getDbInstance();
            Statement stmt = connection.createStatement();
//            Scanner sc = new Scanner(System.in);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            int employee_id = employeeId;

            System.out.println("Enter the Employee name: (String data):");
            String name = input.readLine();

            System.out.println("Enter the department of the Employee (String data):");
            String department = input.readLine();

            System.out.println("Enter the performance of the Employee (excellent/good/average):");
            String performance = input.readLine();

            System.out.println("Enter the salary of the Employee (Amount/yr. in number):");
            String sal = input.readLine();
            double salary = Double.parseDouble(sal);


            String query = "insert into employee values ("
                    + "'" + employee_id + "','" +  name + "','" +  department + "','" +  performance + "','" +  salary+ "')";

            System.out.println(query);
            int rows = stmt.executeUpdate(query);
            if(rows>0){
                System.out.println("Successfully inserted " + rows + " rows");
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error executing SQL query");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeColumnDataType(String columnName, String newDataType){
        try {
            Connection connection = DbManager.getDbInstance();
            Statement stmt = connection.createStatement();

            String query = "ALTER TABLE employee MODIFY COLUMN " +  columnName + " " + newDataType;


            System.out.println(query);
            int rows = stmt.executeUpdate(query);
            if(rows>0){
                System.out.println("Successfully modified column data type");
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error executing SQL query");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void changeColumnDataType(String tableName, String columnName, String newDataType){
        try {
            Connection connection = DbManager.getDbInstance();
            Statement stmt = connection.createStatement();

            String query = "ALTER TABLE " + tableName + " MODIFY COLUMN " +  columnName + " " + newDataType;


            System.out.println(query);
            int rows = stmt.executeUpdate(query);
            if(rows>0){
                System.out.println("Successfully modified column data type");
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error executing SQL query");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void getRowData(String tableName, int employeeID){
        try {
            Connection connection = DbManager.getDbInstance();
            Statement stmt = connection.createStatement();

            String query = "SELECT * FROM " + tableName + " WHERE EMPLOYEE_ID = " + employeeID;
            System.out.println(query);

            ResultSet resultSet = stmt.executeQuery(query);
            while ((resultSet.next())) {

                System.out.println(resultSet.getString("EMPLOYEE_ID") + "\t" +
                        resultSet.getString("NAME")  + "\t" +
                        resultSet.getString("DEPARTMENT")  + "\t" +
                        resultSet.getString("PERFORMANCE")  + "\t" +
                        resultSet.getString("SALARY"));

//                System.out.println(resultSet.getRow());
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error executing SQL query");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


 /*   private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }*/

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        getTableData(tableName, columnName);
    }
}
