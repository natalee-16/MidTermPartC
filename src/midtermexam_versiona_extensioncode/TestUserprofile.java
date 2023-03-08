/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author nbui6
 */
import java.util.*;

public class TestUserprofile {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = kb.nextLine();

        System.out.println("Choose your favorite genre from the following list:)");
        for (int i = 0; i < UserProfile.genres.length; i++) {
            
            System.out.println((i+1) + ". " + UserProfile.genres[i]);
        }
        int genre = kb.nextInt();

        UserProfile newUser = new UserProfile(name, UserProfile.genres[genre-1]);
        System.out.println("Your account has been created");

    }
}
