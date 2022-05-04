//Anthony Franklin afranklin18@cnm.edu
//RockPaperScissors Program2

//RockUI.java

public class MainP2 {
    private RockUI ui;

    public static void main(String[] args) {
        RockPS rps = new RockPS();
        RockUI ui = new RockUI(rps);
        ui.play();
        System.exit(0);
    }

}
