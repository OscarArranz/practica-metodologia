package model;

public class DefaultUser extends User {

    private String registerNum;

    public DefaultUser(int id, String username, String password, String registerNum) {
        super(id, username, password);
        this.registerNum = registerNum;
    }

    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }

}
