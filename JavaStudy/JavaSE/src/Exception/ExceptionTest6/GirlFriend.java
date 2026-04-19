package Exception.ExceptionTest6;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {}

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException {
        if (name.length() < 3 || name.length() > 10) {
            //throw new RuntimeException();
            throw new NameformatException("年龄的长度应该在3 - 10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if (age < 18 || age > 40) {
            //throw new RuntimeException();
            throw new AgeoutofboundException("年龄的范围应该是18 - 40");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
