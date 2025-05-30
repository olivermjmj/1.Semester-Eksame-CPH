public class User implements Comparable<User>{

    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public User(String name, String password, String email) {
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    public User(String name, String password, String email, String phoneNumber) {
        setName(name);
        setPassword(password);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    //Setters and getters
    public void setName(String name) {
        if((name != null && name.length() <= 12) && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            System.out.println("Name must start with a capital letter and must be between 1-12");
            this.name = "NONE";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    @Override
    public String toString() {
        if((getName() != null && getPassword() != null) && (getEmail() == null && getPhoneNumber() == null)) {
            return "Username = " + getName() + "|" + "Password: " + getPassword();
        } else if((getName() != null && getPassword() != null) && (getEmail() != null && getPhoneNumber() == null)) {
            return "Username = " + getName() + "|" + "Password: " + getPassword() + "|" + "Email: " + getEmail();
        } else if((getName() != null && getPassword() != null) && (getEmail() != null && getPhoneNumber() != null)) {
            return "Username = " + getName() + "|" + "Password: " + getPassword() + "|" + "Email: " + getEmail() + "|" + "Number" + getPhoneNumber();
        }
        return "NONE";
    }

    @Override
    public int compareTo(User user) {
        return this.name.compareTo(user.name);
    }
}
