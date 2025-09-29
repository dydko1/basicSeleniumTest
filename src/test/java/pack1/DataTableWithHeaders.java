package pack1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.it.Ma;
import pack1.model.Book;
import pack1.model.User;

import java.util.List;
import java.util.Map;

public class DataTableWithHeaders {
    @Given("User submits a valid registration form header 11")
    public void userSubmitsAValidRegistrationFormHeader(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        mapList.forEach(s -> {
            s.forEach((k, v) -> System.out.println(v));
        });
        //System.out.println(dataTable.toString());
    }

    @Given("User submits a valid registration form header 2")
    public void userSubmitsAValidRegistrationFormHeader2(List<Map<String, String>> list) {
        //for (Map<String, String> stringStringMap : list) {
        System.out.println(list.get(0).entrySet());
        // }
    }

    @Given("User submits a valid registration form header 3")
    public void userSubmitsAValidRegistrationFormHeader3(List<User> users) {
        for (User user : users) {
            System.out.println(user.getName() + "\teee\t" + user.getLastName());
        }

    }
}
