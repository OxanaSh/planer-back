package she.step.planerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import she.step.planerback.model.Priority;
import she.step.planerback.service.priority.interfaces.IPriorityServiceService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRESTController {

    IPriorityServiceService service;

    @Autowired
    public PriorityRESTController(IPriorityServiceService service){
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Priority> getAll(){
        return service.getAll();
    }

    @GetMapping("/delete/{id}")
    public Priority delete(@PathVariable("id")Integer id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Priority create(@RequestBody Priority priority){
        return service.create(priority);
    }

    @PostMapping("/update")
    public Priority update(@RequestBody Priority priority){

        return service.update(priority);
    }


}
