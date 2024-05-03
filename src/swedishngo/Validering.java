/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swedishngo;

/**
 *
 * @author felipecigel
 */
public class Validering {

    public boolean isValidEmail(String email) {
        // Enkel validering för e-postadress med reguljära uttryck
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    public boolean isValidPassword(String password) {
        // Enkel validering för lösenord: minst 8 tecken långt
        return password.length() >= 15;
    }

}
