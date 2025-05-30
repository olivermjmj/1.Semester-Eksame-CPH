public class User implements Comparable<User>{

    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String name, String password) {

        setName(name);
        this.password = password;
    }

    public User(String name, String password, String email) {
        setName(name);
        this.password = password;
        setEmail(email);
    }

    public User(String name, String password, String email, String phoneNumber) {
        setName(name);
        this.password = password;
        setEmail(email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {

        if((getName() != null && getPassword() != null) && (getEmail() == null && getPhoneNumber() == null)) {
            return "Username: " + getName() + ". Password: " + getPassword();
        } else if((getName() != null && getPassword() != null) && (getEmail() != null && getPhoneNumber() == null)) {
            return "Username: " + getName() + ". Password: " + getPassword() + ". Email: " + getEmail();
        } else if((getName() != null && getPassword() != null) && (getEmail() != null && getPhoneNumber() != null)) {
            return "Username: " + getName() + ". Password: " + getPassword() + ". Email: " + getEmail() + ". Phone number: " + getPhoneNumber();
        }
        return "NONE";
    }

    //Getter's
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //Setter's
    public void setName(String name) {
        if(name != null && name.length() <= 12 && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            System.out.println("Name must start with a capital letter and can max contain 1 - 12 characters");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email must contain @");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(User otherUser) {
        return this.name.compareTo(otherUser.name);
    }
}
