package Ccollection.Sset.HashSet.HashSetTest2;

public class Main {

    static void main() {

        /*
                哈希值 ：
                        对象的参数表现形式
                        1. 如果没有重写hashCode方法， 计算出的哈希值是不同的
                        2. 如果重写hashCode方法， 不同的对象只要属性值相同， 计算出的哈希值就是一样的
                        3. 但是在小部分情况下， 不同的属性值或者不同的地址值计算出来的哈希值也有可能是一样的 （哈希碰撞）

         */
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        //没重写
        System.out.println(s1.hashCode()); //603742814
        System.out.println(s2.hashCode()); //1067040082

        //重写过后
        System.out.println(s1.hashCode()); //-1461067292
        System.out.println(s2.hashCode()); //-1461067292

        //小概率的哈希碰撞
        System.out.println("abc".hashCode()); //96354
        System.out.println("acD".hashCode()); //96354
    }
}
