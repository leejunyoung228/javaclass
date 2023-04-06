package ch16.dotcom;

import java.util.ArrayList;

public class DotComBust {
    private ArrayList<DotCom> dotComs = new ArrayList<>();
    private GameHelper gameHelper = new GameHelper();
    private int numOfHits;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void startPlaying() {
//        gameHelper.printAll();
        while (!dotComs.isEmpty()) {
            String userGuess = gameHelper.getUserInput("enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void finishGame() {
        System.out.println(numOfHits + " guesses");
        if (numOfHits <= 18) {
            System.out.println("good job");
        } else {
            System.out.println("^_^;");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfHits++;
        String result = "miss";
        for (DotCom dotCom : dotComs) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("kill")) {
                dotComs.remove(dotCom);
                break;
            } else if (result.equals("hit")) {
                break;
            }
        }
        System.out.println(result);
    }

    private void setUpGame() {
        dotComs.add(new DotCom("google.com"));
        dotComs.add(new DotCom("naver.com"));
        dotComs.add(new DotCom("kakao.com"));

        for (DotCom dotCom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation(newLocation);
        }
    }
}