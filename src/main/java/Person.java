public class Person {
    private int id;
    private double age;
    private String name;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0) return;
        this.id = id;
    }
    public Person withId(int id) {
        if(id < 0) return this;
        this.id = id;
        return this;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if(age < 0) return ;
        this.age = age;
    }
    public Person withAge(double age) {
        if(age < 0) return this;
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) return;
        this.name = name;
    }

    public Person withName(String name) {
        if(name == null) return this;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}
