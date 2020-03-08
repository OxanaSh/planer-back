package she.step.planerback.dao.task.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import she.step.planerback.dao.task.interfaces.ITaskDAO;
import she.step.planerback.model.Category;
import she.step.planerback.model.Priority;
import she.step.planerback.model.Task;
import she.step.planerback.repository.TaskRepositoryMongo;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("mongoT")
public class TaskDAOImpl implements ITaskDAO {

    private List<Task> list = new ArrayList<>(Arrays.asList(
            new Task  (1, "Залити бензин", true,
                    new Priority(),
                    new Category(),
                    LocalDate.of(2020, 4, 26)
                    ),
            new Task ()
            ));


    private final TaskRepositoryMongo repository;

    @Autowired
    public TaskDAOImpl(TaskRepositoryMongo repository) {
        this.repository = repository;
    }

   @PostConstruct
    void init(){
   //     repository.deleteAll();
        repository.saveAll(list);
    }



    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task get(Integer id) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task delete(Integer id) {
        return null;
    }

    @Override
    public List<Task> getAll() {
        return null;
    }
}
