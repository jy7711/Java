package Abstract;

public abstract class Animal {

    private String name;
    private String colour;

    public Animal() {}

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //alt + 回车 自动修复

    public abstract void eat();

    public void drink() {
        System.out.println("喝水");
    }
}
