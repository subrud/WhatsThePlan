package platinum.whatstheplan.models;

public class UserProfile {

    String phone;
    String password;
    boolean isAdmin;
    String name;
    String uid;

    public UserProfile() {
    }

    public UserProfile(String phone, String password, boolean isAdmin, String name, String uid) {
        this.phone = phone;
        this.password = password;
        this.isAdmin = isAdmin;
        this.name = name;
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}



