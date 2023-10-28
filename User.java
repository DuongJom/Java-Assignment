import java.util.Date;

public class User {
    private String state;
    private int lastSignIn;
    private String username;
    private int logInTime;
    private int pinNumber;
    private String lastName;
    private int totalPlayTime;
    private String city;
    private int zipCode;
    private Date dateOfBirth; 

    public User(){}
    public User(String state, int lastSignIn, String username, 
                int logInTime, int pinNumber, String lastName, 
                int totalPlayTime, String city, int zipCode, Date dateOfBirth){
        this.state = state;
        this.lastSignIn = lastSignIn;
        this.username = username;
        this.logInTime = logInTime;
        this.pinNumber = pinNumber;
        this.lastName = lastName;
        this.totalPlayTime = totalPlayTime;
        this.city = city;
        this.zipCode = zipCode;
        this.dateOfBirth = dateOfBirth;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int getLastSignIn(){
        return this.lastSignIn;
    }

    public void setLastSignIn(int lastSignIn){
        this.lastSignIn = lastSignIn;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getLogInTime(){
        return this.logInTime;
    }

    public void setLogInTime(int logInTime){
        this.logInTime = logInTime;
    }

    public int getPinNumber(){
        return this.pinNumber;
    }

    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getTotalPlayTime(){
        return this.totalPlayTime;
    }

    public void setTotalPlayTime(int totalPlayTime){
        this.totalPlayTime = totalPlayTime;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public int getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
}