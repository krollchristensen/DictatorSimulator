public class MilitaryDictator extends Leader implements PowerActions {
    private String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    public String implementPolicy(String policy) {
        return "MilitaryDictator " + name + " is implementing military policy: " + policy;
    }

    @Override
    public String repressOpposition() {
        return "MilitaryDictator " + name + " is repressing the opposition with force.";
    }

    @Override
    public String holdParade() {
        return "MilitaryDictator " + name + " is holding a military parade.";
    }

    @Override
    public String giveSpeech() {
        return "MilitaryDictator " + name + " gives a speech emphasizing military strength.";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Military Rank: " + militaryRank);
    }
}
