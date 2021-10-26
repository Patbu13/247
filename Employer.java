import java.util.UUID;
public class Employer extends User{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String location;
    private String company;
    private int userType;
    private String phoneNum;
    private UUID ID;

    public Employer(String username, String password, String email, String firstName, String lastName, int userType, String phoneNum, UUID ID) {
        super(username, password, email, firstName, lastName, userType, phoneNum, ID);
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.phoneNum = phoneNum;
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail()  {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getLocation() {
        return location;
    }

    public String getCompany() {
        return company;
    }

    public int getUserType(){
        return userType;
    }

    public String phoneNum() {
        return phoneNum;
    }

    public UUID getID(){
        return ID;
    }
}