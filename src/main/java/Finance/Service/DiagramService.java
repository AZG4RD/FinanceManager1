package Finance.Service;

import Finance.DTO.DiagramDTO.DiagramRequest;
import Finance.DTO.DiagramDTO.DiagramResponse;
import lombok.RequiredArgsConstructor;
import Finance.model.Diagram;
import org.springframework.stereotype.Service;
import Finance.repository.DiagramRepository;

@Service
@RequiredArgsConstructor
public class DiagramService {
    private final DiagramRepository diagramRepository;
    public DiagramResponse createDiagram(DiagramRequest diagramRequest) {
        Diagram d = new Diagram();
        d.setUserId(diagramRequest.getUserId());
        d.setTitle(diagramRequest.getTitle());
        d.setType(diagramRequest.getType());
        d.setConfiguration(diagramRequest.getConfiguration());
        d = diagramRepository.save(d);
        var diagramResponse = new DiagramResponse();
        diagramResponse.setDiagramId(d.getDiagramId());
        diagramResponse.setUserId(d.getUserId());
        diagramResponse.setTitle(d.getTitle());
        diagramResponse.setType(d.getType());
        diagramResponse.setConfiguration(d.getConfiguration());
        return diagramResponse;
    }
}
