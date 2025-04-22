package Finance.Controller;

import Finance.DTO.UserDTO.UserRequest;
import Finance.DTO.UserDTO.UserResponse;
import Finance.Service.UserService;
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
