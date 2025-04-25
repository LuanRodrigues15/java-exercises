public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
        return this;
    }
}
