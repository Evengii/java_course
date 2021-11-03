package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    /**
     * 1. User enters username, password and old password - create static fields for them
     * 2. Put it into String object
     * 3. Validations:
     *      a) at least 8 characters;
     *      b) uppercase letter
     *      c) special character
     *
     */
    private static final char[] specialCharacters = {'!','~','`','@','$','%','^','&','*','=','+','-','?','/',':',';'};
    private static final String username = "UserPuser123";
    private static final String oldPassword = "oldOne@";
    private static String password;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter new password:");
        password = scanner.next();

        if(atLeastEight(password)){
            if(notOldCredentials(password)){
                if(hasUppercaseCharacter(password)){
                    if(hasSpecialCharacters(password)){
                        System.out.println("Your password accepted");
                    } else {
                        System.out.println("Try again.");
                        atLeastEight(password);
                    }
                }
                else {
                    System.out.println("Try again.");
                    atLeastEight(password);
                }
            } else {
                System.out.println("Try again.");
                atLeastEight(password);
            }
        } else {
            System.out.println("Try again.");
            atLeastEight(password);
        }

    }

    private static boolean hasUppercaseCharacter(String password) {
        boolean perem = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                perem =  true;
            } else {
                System.out.println("Password must have at least one uppercase letter");
                perem = false;
            }
        }
        return perem;
    }

    private static boolean hasSpecialCharacters(String password) {
        boolean perem = false;
        for(int i = 0; i < specialCharacters.length; i++){
            for(int j = 0; j < password.length(); j++){
                if(password.charAt(j) == specialCharacters[i]){
                    perem = true;
                    break;
                } else {
                    System.out.println("Password must have at least one special character");
                    perem = false;
                }
            }
        }
        return perem;
    }

    public static boolean notOldCredentials(String password){
        if(password != username && password != oldPassword){
            return true;
        } else {
            System.out.println("Password cannot repeat old one or username");
            return false;
        }
    }

    public static boolean atLeastEight(String password){
        if(password.length() >= 8){
            return true;
        } else {
            System.out.println("Password must have at least 8 characters.");
            return false;
        }
    }
}
