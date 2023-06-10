import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString.length() == 0) return false;
        if (isLowerCase(myString.charAt(0))) {
            for (int i = 0; i < myString.length(); i++) {
                if (isUpperCase(myString.charAt(i)))
                    return false;
            }
            return true;
        }
        else {
            if(isLowerCase(myString.charAt(1))) {
                for (int i = 1; i < myString.length(); i++) {
                    if (isUpperCase(myString.charAt(i)))
                        return false;
                }
            }
            else {
                for (int i = 1; i < myString.length(); i++) {
                    if (isLowerCase(myString.charAt(i)))
                        return false;
                }
            }
        }
        return true;
    }
}

