package user;

import java.util.Date;



public class UserConfig {

    private String userId;

    private Date overTime;

    public UserConfig(String userId, Date overTime) {
        this.userId = userId;
        this.overTime = overTime;
    }

    public UserConfig() {
    }
}
