package materialdesign.com.androidretrofittutorial.model;

/**
 * Created by yekokohtet on 1/10/17.
 */

public class User {
    private String name;
    private String hobby;

    public User(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
