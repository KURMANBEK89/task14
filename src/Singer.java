public class Singer extends Person{
    private String bandName;

    public void sing(){
        System.out.println("Singer is singing");
    }
    public void playGitar(){
        System.out.println("Singer is playing gitar");
    }

    public Singer(String name, String disignation, String bandName) {
        super(name, disignation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println("Singer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Singer is eating");
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + super.getName() + '\'' +
                ", disignation='" + super.getDisignation() + '\'' +
                " band="+'\''+getBandName()+'\''+'}';
    }
}
