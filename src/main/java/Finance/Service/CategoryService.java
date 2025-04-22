package Finance.Service;

import Finance.DTO.CategoryDTO.CategoryRequest;
import Finance.DTO.CategoryDTO.CategoryResponse;
import lombok.RequiredArgsConstructor;
import Finance.model.Category;
import org.springframework.stereotype.Service;
import Finance.repository.CategoryRepository;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryResponse create(CategoryRequest categoryRequest) {
        Category c = new Category();
        c.setName(categoryRequest.getName());
        c.setDescription(categoryRequest.getDescription());
        c.setType(categoryRequest.getType());
        c =  categoryRepository.save(c);
        var response = new CategoryResponse();
        response.setCategoryId(c.getCategoryId());
        response.setName(c.getName());
        response.setDescription(c.getDescription());
        response.setType(c.getType());
        return response;
    }
}
