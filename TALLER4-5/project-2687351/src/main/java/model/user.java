package model;

public class user {
    private Integer user_id;
    private Integer user_firstname;
    private Integer user_lastname;
    private Integer user_emaill;
    private Integer user_password;

    public user(Integer user_id, Integer user_firstname, Integer user_lastname, Integer user_emaill, Integer user_password) {
        this.user_id = user_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_emaill = user_emaill;
        this.user_password = user_password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "user{" +
                "user_id=" + user_id +
                ", user_firstname=" + user_firstname +
                ", user_lastname=" + user_lastname +
                ", user_emaill=" + user_emaill +
                ", user_password=" + user_password +
                '}';
    }
}
