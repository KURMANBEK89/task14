public class Dancer extends Person{
    private String groupName;

    public void dancing(){
        System.out.println("Dancer is dancing");
    }

    public Dancer(String name, String disignation, String groupName) {
        super(name, disignation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Dancer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Dancer is eating");
    }

    @Override
    public String toString() {
        return "Dancer{name='"+super.getName()+", dsignation='"+super.getDisignation()+", group='"+getGroupName()+"'}";
    }
}
