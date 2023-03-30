package ch15.simpledotcom;

public class SimpleDotCom {
    private int[] location;
    private int numOfHits;
    public void setLocation(int[] location) {
        this.location = location;
    }

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        for (int i : location) {
            if (i == guess){
                numOfHits++;
                if (numOfHits == location.length) {
                    return "kill";
                }
                return "hit";
            }
        }
        return "miss";
    }
}
