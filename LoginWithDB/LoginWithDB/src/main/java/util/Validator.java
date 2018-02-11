package util;

public class Validator {
    private Validator(){

    }
    public static boolean isEmpty(String value){
        return value == null || value.equals ("");
    }
}
