import java.lang.reflect.Field;
import java.util.Map;

public class Person {

    private int age;
    private String name;
    private String lastName;
    private String phonNumber;


    public Person(int age, String name, String lastName, String phonNumber) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.phonNumber = phonNumber;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    //Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    @Override
    public boolean equals(Object p){
        if(p == null){
            return false;
        }

        if(!Person.class.isAssignableFrom(p.getClass())){
            return false;
        }

        final Person other = (Person)p;
        if((this.name == null) ? (other.name == null) : this.name.equals(other.getName())){
            return false;
        }

        if((this.lastName == null) ? (other.lastName == null) : this.lastName.equals(other.getLastName())){
            return false;
        }

        if(this.age != other.getAge()){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 53 * hash + this.age;
        return hash;
    }

//    public boolean reflectionEqualse(Object p) {
//        if (p == null) {
//            return false;
//        }
//
//        boolean result = true;
//        Field[] fields = p.getClass().getDeclaredFields();
//        Field[] currentObjFields = this.getClass().getDeclaredFields();
//        try {
//            Map<String, Object> attriButeNameValueMap = null;
//
//            for (Field field : fields) {
//                field.setAccessible(true);
//
//                Object value = field.get(p);
//                attriButeNameValueMap.put(field.getName(), value);
//            }
//            for (Field field : currentObjFields) {
//                field.setAccessible(true);
//
//                Object value = field.get(currentObj);
//                if(attriButeNameValueMap.containsKey(field.getName())){
//                    if(value instanceof Boolean){
//                        result=areEqual((Boolean)value, (Boolean)attriButeNameValueMap.get(field.getName()));
//                    }
//        } catch (IllegalArgumentException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
}
