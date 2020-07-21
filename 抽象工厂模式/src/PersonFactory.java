/**
 * @Author ZhangKe
 * @Date 2020/7/21 15:59
 * @Version 1.0
 */
public class PersonFactory extends AbstractFactory {
    @Override
    public Person getPerson(String person) {
        if (person == null) {
            return null;
        }
        if ("man".equals(person)) {
            return new Man();
        }
        if ("woman".equals(person)) {
            return new Woman();
        }
        return null;
    }

    @Override
    public Sport getSport(String sportType) {
        return null;
    }
}
