public class Person {
    private String name;
    private String disignation;

    public void learn(){
        System.out.println("Person is learning");
    }
    public void walk(){
        System.out.println("Person is walking");
    }
    public void eat(){
        System.out.println("Person is eating");
    }

    public Person(String name, String disignation) {
        this.name = name;
        this.disignation = disignation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisignation() {
        return disignation;
    }

    public void setDisignation(String disignation) {
        this.disignation = disignation;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", disignation='" + disignation + '\'' +
                '}';
    }
}
