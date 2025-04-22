package Controller;

import DTO.UserDTO.UserRequest;
import DTO.UserDTO.UserResponse;
import Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable String id){
        return userService.getUserById(Integer.valueOf(id));
    }
}
