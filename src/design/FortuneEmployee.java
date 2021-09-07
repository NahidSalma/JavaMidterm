package design;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {
//EmployeeInfo info = new EmployeeInfo(107);
//DbManager.insertDataIntoTable(109);

//        DbManager.getTableData("employee","NAME");
//        DbManager.changeColumnDataType("SALARY", "double");
//        DbManager.changeColumnDataType("employee","SALARY", "int");
//        DbManager.getRowData("employee",107);
//       DbManager.insertDataIntoTable(110);

DbManager.getRowData("employee", 110);
    }

}
