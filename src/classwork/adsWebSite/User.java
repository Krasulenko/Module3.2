package classwork.adsWebSite;

public class User {
    private String firsName;
    private String lastName;

    private String phone;

    private Message [] messages = new Message[5];

    public User(String firsName, String lastName, String phone, Message[] messages) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.phone = phone;
        this.messages = messages;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
