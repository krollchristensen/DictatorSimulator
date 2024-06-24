public class PoliticalDictator extends Leader implements PowerActions {
    private String partyName;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }

    @Override
    public String implementPolicy(String policy) {
        return "PoliticalDictator " + name + " is implementing political policy: " + policy;
    }

    @Override
    public String repressOpposition() {
        return "PoliticalDictator " + name + " is repressing the opposition through political means.";
    }

    @Override
    public String holdParade() {
        return "PoliticalDictator " + name + " is holding a political parade.";
    }

    @Override
    public String giveSpeech() {
        return "PoliticalDictator " + name + " gives a speech promoting the party's agenda.";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Party Name: " + partyName);
    }
}
