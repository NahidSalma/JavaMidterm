package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ParserUtils {

    public static void main(String[] args) {
        // Implement unit tests for all user-defined methods in this package, here.
        String pathSelenium = System.getProperty("user.dir") + "/src/parser/selenium.xml";
        String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
        String tag = "id";


        try {
            getStudentInfo(pathSelenium, tag);
            getStudentInfo(pathQtp, tag);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void getStudentInfo(String xmlFilePath, String tagName) throws ParserConfigurationException, SAXException, IOException {
        // Path of XML data to be read.
        String pathSelenium = xmlFilePath;
        String tag = tagName;

        Map<String, List<Student>> list = new LinkedHashMap<String, List<Student>>();

        List<Student> seleniumStudents = new ArrayList<Student>();
        List<Student> qtpStudents = new ArrayList<Student>();

        XmlReader xmlReader = new XmlReader();

        seleniumStudents = xmlReader.parseData(tag, pathSelenium);

        list.put("seleniumStudents", seleniumStudents);


        for (Student st : seleniumStudents) {
            System.out.println("Student (id= "+ st.getId() + ")\t\"" + st.getFirstName() + "\"\t \"" + st.getLastName() + "\"\t\t Grade= " + st.getScore());
        }
        System.out.println();



    }


}
