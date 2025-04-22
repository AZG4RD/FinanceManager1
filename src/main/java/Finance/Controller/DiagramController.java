package Finance.Controller;

import Finance.DTO.DiagramDTO.DiagramRequest;
import Finance.DTO.DiagramDTO.DiagramResponse;
import Finance.Service.DiagramService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/diagrams")
@RequiredArgsConstructor
public class DiagramController {
    private final DiagramService diagramService;
    @PostMapping
    public DiagramResponse create(
            @PathVariable Integer userId,
            @RequestBody DiagramRequest diagramRequest
            ){
        diagramRequest.setUserId(userId);
        return diagramService.createDiagram(diagramRequest);
    }
}
