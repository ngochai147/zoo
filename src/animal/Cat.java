package animal;

public class Cat {
    String name;
    String gender;
    int age;
    String purr;
    String describe;
    String nicknames;


    public Cat(String name, String gender, int age, String purr, String describe, String nicknames) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.purr = purr;
        this.describe = describe;
        this.nicknames = nicknames;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", purr='" + purr + '\'' +
                ", describe='" + describe + '\'' +
                ", nicknames='" + nicknames + '\'' +
                '}';
    }
}
