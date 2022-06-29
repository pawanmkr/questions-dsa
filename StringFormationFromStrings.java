import java.util.ArrayList;

public class StringFormationFromStrings {

    public int isRepeating(String s) {
        int stringSize = s.length();
        ArrayList<Integer> divisiors = new ArrayList<Integer>();

        //this loop is finding all the divisors of stringSize
        for (int i = 0; i < stringSize; i++) {
            if (stringSize % i == 0 || i == 0) {
                divisiors.add(i);
            }
        }
        int divisorCounter = 0;
        String subString = "";
        //main loop
        for (int i = divisiors.get(divisorCounter); i < divisiors.size(); i++) {
            //this loop is for making a possible substring no. of times
            for (int j = 0; j <= i; j++) {
                subString += s.charAt(j);
            }
            String tempString = "";
            //appending subString and comparing
            for (int k = 0; k < stringSize; k++) {
                tempString += subString;
            }
            if (tempString == s) {
                return 1;
            }

            divisorCounter++;
        }

        return 0;
    }

    public static void main(String[] args) {
        String sampleString = "aaaaaa";
        StringFormationFromStrings shortName = new StringFormationFromStrings();
        shortName.isRepeating(sampleString);
    }
}
