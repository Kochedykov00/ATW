package login.registration;

public class Customer {

    String name;
    String username;
    String password;

    public Customer(String name, String usernmae, String password) {
        this.name = name;
        this.username = usernmae;
        this.password = password;
    }

    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsernmae(String usernmae) {
        this.username = usernmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
