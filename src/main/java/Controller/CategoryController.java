package Controller;

import DTO.CategoryDTO.CategoryRequest;
import DTO.CategoryDTO.CategoryResponse;
import Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
    public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping
    public CategoryResponse create(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.create(categoryRequest);
    }
}
