public class Main {
    public static void main(String[] args) {
        // Opret instanser af MilitaryDictator og PoliticalDictator
        MilitaryDictator militaryDictator = new MilitaryDictator("General Zod", "Krypton", 15, "General");
        PoliticalDictator politicalDictator = new PoliticalDictator("Chancellor Palpatine", "Galactic Empire", 20, "Sith Party");

        // Brug polymorfi med Leader referencer
        Leader[] leaders = {militaryDictator, politicalDictator};

        // Iterer over lederne og kald deres metoder
        for (Leader leader : leaders) {
            leader.printDetails();
            System.out.println(leader.giveSpeech());
            if (leader instanceof PowerActions) {
                PowerActions actions = (PowerActions) leader;
                System.out.println(actions.implementPolicy("New Policy"));
                System.out.println(actions.repressOpposition());
                System.out.println(actions.holdParade());
            }
            System.out.println();
        }


    }
}