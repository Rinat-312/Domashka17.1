import java.util.Arrays;

public class Farm {
    private String adress;
    private String ownerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;

    public Farm(String adress, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.adress = adress;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }



    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

