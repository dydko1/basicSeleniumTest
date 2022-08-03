package pl.sii.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePerson = new ArrayList<Person>();

        for (Person p : persons) {
            if(p.getGender().equalsIgnoreCase("Female"))
                femalePerson.add(p);
        }
        return femalePerson;
    }
}
