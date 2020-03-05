package she.step.planerback.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import she.step.planerback.model.Priority;
import she.step.planerback.model.Task;
import she.step.planerback.service.task.interfaces.ITaskServiceService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/task")
public class TaskRESTController {

    ITaskServiceService service;

    @Autowired
    public TaskRESTController(ITaskServiceService service){
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Task> getAll(){
        return service.getAll();
    }



}
