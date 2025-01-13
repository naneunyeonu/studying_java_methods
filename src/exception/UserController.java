package exception;

public class UserController {
    private UserService userService;

    public void handleCreateUser(String username) {
        try {
            userService.createUser(username);
        } catch (CustomException e) {
            System.out.println("ERROR: " + e.getMessage() + "Code: " + e.getErrorCode());
        }
    }
}
