package ch16.dotcom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> location = new ArrayList<>();
    private String name;

    public DotCom(String name) {
        this.name = name;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String checkYourself(String userGuess) {
        String status = "miss";
        int index = location.indexOf(userGuess);
        if (index >= 0) {
            location.remove(index);
            if (location.isEmpty()) {
                status = "kill";
            } else {
                status = "hit";
            }
        }

        return status;
    }
}
