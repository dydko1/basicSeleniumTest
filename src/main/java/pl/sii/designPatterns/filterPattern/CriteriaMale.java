package pl.sii.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<Person>();

        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("male"))
                malePerson.add(p);
        }
        return malePerson;
    }
}
