package Service;

import DTO.UserDTO.UserRequest;
import DTO.UserDTO.UserResponse;
import Exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponse createUser(UserRequest userRequest) {
        User u = new User();
        u.setUsername(userRequest.getUsername());
        u.setPassword(userRequest.getPassword());
        u.setEmail(userRequest.getEmail());
        u.setCreatedAt(LocalDateTime.now());
        User savedUser = userRepository.save(u);

        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(savedUser.getUserId());
        userResponse.setUsername(savedUser.getUsername());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setCreatedAt(LocalDateTime.now());
        return userResponse;
    }
    public UserResponse getUserById(Integer userId) {
        User u = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь не найден" + userId));
        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(u.getUserId());
        userResponse.setUsername(u.getUsername());
        userResponse.setEmail(u.getEmail());
        userResponse.setCreatedAt(u.getCreatedAt());
        return userResponse;
    }

}
