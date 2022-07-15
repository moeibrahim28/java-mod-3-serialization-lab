import java.util.List;

public class ObjectMapper {
    public String writeValueAsString(List<Person> personList) {

        StringBuffer personStringJSON = new StringBuffer();
        personStringJSON.append("[\n");
        for (Person person : personList) {
            personStringJSON.append("\t{\n");
            personStringJSON.append("\t\t\"firstName\": \""+ person.getFirstName()+"\"");
            personStringJSON.append(",\n");
            personStringJSON.append("\t\t\"lastName\": \""+ person.getLastName()+"\"");
            personStringJSON.append(",\n");
            personStringJSON.append("\t\t\"birthYear\": "+ person.getBirthYear());
            personStringJSON.append(",\n");
            personStringJSON.append("\t\t\"birthMonth\": "+ person.getBirthMonth());
            personStringJSON.append(",\n");
            personStringJSON.append("\t\t\"birthDay\": "+ person.getBirthDay());
            personStringJSON.append("\n\t},\n");
        }
        personStringJSON.append("];");
            return personStringJSON.toString();
        }
    }

