public class Student  {
    Integer id;
    String name;
    Integer roll;

    public Student(Integer id, String name, Integer roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRoll() {
        return roll;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
