package she.step.planerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import she.step.planerback.model.Category;
import she.step.planerback.model.Priority;
import she.step.planerback.service.category.interfaces.ICategoryServiceService;
import she.step.planerback.service.priority.interfaces.IPriorityServiceService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRESTController {

    ICategoryServiceService service;

    @Autowired
    public CategoryRESTController(ICategoryServiceService service){
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Category> getAll(){
        System.out.println("LIST GETALL: " + service.getAll());
        return service.getAll();
    }

    @GetMapping("/delete/{id}")
    public Category delete(@PathVariable("id")Integer id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return service.create(category);
    }

    @PostMapping("/update")
    public Category update(@RequestBody Category category){
        return service.update(category);
    }

    @RequestMapping("/get/{id}")
    public Category get(@PathVariable("id")Integer id){
        return service.get(id);
    }


}
