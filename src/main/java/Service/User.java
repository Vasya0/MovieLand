package Service;

import jakarta.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USERID")
    private int userID;
    private String username;
    private String email;
    private String password;

    public User() {

    }

    public User(int userID, String username, String email, String password) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userID +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}




