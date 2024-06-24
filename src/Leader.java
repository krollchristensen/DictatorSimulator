public abstract class Leader {
    protected String name;
    protected String country;
    protected int yearsInPower;

    public Leader(String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    public abstract String giveSpeech();

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
    }
}
