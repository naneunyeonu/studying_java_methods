package exception;

public class UserService {
    public void createUser(String username) throws CustomException {
        if (username == null || username.isEmpty()) {
            throw new CustomException("Username cannot be null or empty", "User_001");
        }
        // 사용자 생성 로직
    }
}
