package pack1.transformers;

import io.cucumber.java.DataTableType;
import pack1.model.User;

import java.util.Map;

public class UserTransformers {
    @DataTableType
    public User userEntryTransformer(Map<String, String> row) {
        return new User(
                row.get("name"),
                row.get("lastName")
        );
    }
}
