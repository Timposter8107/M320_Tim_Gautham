public class Figur {
    private String characterName;

    private IWaffenVerhalten waffe;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setWaffe(IWaffenVerhalten waffe) {
        this.waffe = waffe;
    }

    public void kaempfen() {
        waffe.verwendeWaffen();
    }
}
