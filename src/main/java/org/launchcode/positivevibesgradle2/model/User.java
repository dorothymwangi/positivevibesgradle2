package org.launchcode.positivevibesgradle2.model;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @NotNull
    @Size(min = 3, max = 20, message = "Name must contain at least 3 characters and not exceed 20 characters")
    @NotEmpty(message = "*Please provide your first name")
    private String firstName;

    @NotNull
    @Size(min = 3, max = 20, message = "Name must contain at least 3 characters and not exceed 20 characters")
    @NotEmpty(message = "*Please provide your last name")
    private String lastName;


    @Column(name = "username", nullable = false, unique = true)
    @Size(min = 5, message = "*Your username must have at least 5 characters")
    @NotEmpty(message = "*Please provide your username")
    private String userName;

    @NotNull
    @Email(message = "Invalid email address")
    private String email;

    @NotNull
    @Pattern(regexp = "(\\S){6,20}", message = "Password must have 6-20 non-whitespace characters")
    private String password;

   /* @OneToMany
    @JoinColumn(name = "user_id")
    private List<Post> posts = new ArrayList<>();*/

    public User(String firstName, String lastName, String userName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public User(){}

    public int getId() {
        return id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

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
