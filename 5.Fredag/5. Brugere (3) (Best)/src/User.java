public class User implements Comparable<User> {

    String name;
    String password;
    String email;
    int phoneNumber;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public User(String name, String password, String email) {
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    public User(String name, String password, String email, int phoneNumber) {
        setName(name);
        setPassword(password);
        setEmail(email);
        setPhoneNumber(phoneNumber);
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

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        if(name != null && name.length() <= 12 && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(User user) {
        return this.name.compareTo(user.name);
    }

    @Override
    public String toString() {
        if(getName() != null && getPassword() != null && getEmail() == null && getPhoneNumber() == 0) {
            return getName() + "'s password = " + getPassword();
        } else if(getName() != null && getPassword() != null && getEmail() != null && getPhoneNumber() == 0) {
            return getName() + "'s password = " + getPassword() + ", where the email is: " + getEmail();
        } else if(getName() != null && getPassword() != null && getEmail() != null && getPhoneNumber() != 0) {
            return getName() + "'s password = " + getPassword() + ", where the email is: " + getEmail() + " and their phone-number = "  + getPhoneNumber();
        }
        return "None";
    }
}
