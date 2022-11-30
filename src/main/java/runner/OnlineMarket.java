package runner;

import dto.User;

import java.util.HashMap;

import static constant.PropertyConstant.BCRYPT_CONSTANT_PARAMETER;

public class OnlineMarket {

    private static final HashMap<String, User> users = new HashMap<>(10);
    public static boolean isExistsUser(String login) {
        return users.containsKey(login);
    }
    public static User getUser(String login) {
        return users.get(login);
    }

    public static void main(String[] args) {

        System.setProperty(BCRYPT_CONSTANT_PARAMETER, "$2a$10$DjOkk0IX5.zEu/VraKU7re");

    }

}
