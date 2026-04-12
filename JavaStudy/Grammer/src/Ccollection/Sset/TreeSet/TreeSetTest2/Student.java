package Ccollection.Sset.TreeSet.TreeSetTest2;

public class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    // this : 表示你当前要添加的元素
    // o :    表示已经在红黑树里的元素
    // 0 ： 表示当前要添加的元素已存在， 舍弃
    public int compareTo(Student o) {
        //指定排序规则， 按年龄从小到大排序
        return this.getAge() - o.getAge();
    }
}
