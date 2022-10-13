public class Programmer extends Person {
    private String companyName;

    public void coding(){
        System.out.println("Programmer is coding");
    }

    public Programmer(String name, String disignation, String companyName) {
        super(name, disignation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Programmer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }

    @Override
    public String toString() {
        return "Programmer{name='"+super.getName()+"', disignation='"+super.getDisignation()+"', "+"company='"+getCompanyName()+"'}";
    }


}
