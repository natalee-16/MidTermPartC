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

        System.out.println("Choose your favorite genre (Comedy, Drama, Action, Mystery)");
        String genre = kb.nextLine();

        UserProfile newUser = new UserProfile(name, genre);
        System.out.println("Your account has been created");

    }
}
