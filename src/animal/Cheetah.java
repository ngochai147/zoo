package animal;

public class Cheetah {
    String name;//tên
    String gender;// giới tính
    int age;// tuổi
    String hobby;// sở thích
    public Cheetah(String name,String gender,int age,String hobby){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.hobby=hobby;
    }
    @Override
    public String toString() {
        return "Cheetah{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

