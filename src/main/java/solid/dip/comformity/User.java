package solid.dip.comformity;

public class User {

    private int id;
    private String name;
    private String pswd;

    public User(int id, String name, String pswd) {
        this.id = id;
        this.name = name;
        this.pswd = pswd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
