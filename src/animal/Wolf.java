package animal;

public class Wolf {
     String name;
     String breed;//giống
    String gender;
    int age;

    public Wolf(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

