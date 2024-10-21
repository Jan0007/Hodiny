package Hodina6;

import java.util.HashMap;

public class UserProfile {
    private final String userId;
    private String jmeno;
    private String prijmeni;
    private String email;

    private static HashMap<String, UserProfile> map;

    private UserProfile(String userId) {
        this.userId = userId;
    }

    public static void main(String[] args) {
        UserProfile user1 = UserProfile.getInstance("user123");
        UserProfile user2 = UserProfile.getInstance("user123");

        System.out.println(user1 == user2);
    }

    public static UserProfile getInstance(String id) {
        if (null == map) {
            map = new HashMap<>();
        }
        if (map.containsKey(id)) {
            return map.get(id);
        }
        return new UserProfile(id);
    }

    public String getUserId() {
        return userId;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getEmail() {
        return email;
    }
}
