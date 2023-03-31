package Previous;

public class PremierClub {
//    create instance variables
    private String clubName;
    private String clubCaptain;
    private String clubCoach;
    private String clubStadium;

    // creating getters and setters;


    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCaptain() {
        return clubCaptain;
    }

    public void setClubCaptain(String clubCaptain) {
        this.clubCaptain = clubCaptain;
    }

    public String getClubCoach() {
        return clubCoach;
    }

    public void setClubCoach(String clubCoach) {
        this.clubCoach = clubCoach;
    }

    public String getClubStadium() {
        return clubStadium;
    }

    public void setClubStadium(String clubStadium) {
        this.clubStadium = clubStadium;
    }

    // creating display method
    public void displayMessage(){
        System.out.printf("Club info:\nThe club name is %s. It is captained by %s and coached by %s. Their home ground is %s.\n\n", getClubName(), getClubCaptain(), getClubCoach(), getClubStadium());

    }

}
