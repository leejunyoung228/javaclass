package ch15.simpledotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> location;
    private int numOfHits;
    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        //iter
        int index = location.indexOf(guess);
        if (index >= 0) {
            location.remove(index);
            if (location.isEmpty()) {
                return "kill";
            }
            return "hit";
        }
        return "miss";
    }

//    public String checkYourself(String guessStr) {
//        int guess = Integer.parseInt(guessStr);
//        for (int i : location) {
//            if (i == guess){
//                numOfHits++;
//                if (numOfHits == location.length) {
//                    return "kill";
//                }
//                return "hit";
//            }
//        }
//        return "miss";
//    }
}
