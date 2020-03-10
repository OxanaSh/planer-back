package she.step.planerback.dao.priority.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import she.step.planerback.dao.priority.interfaces.IPriorityDAO;
import she.step.planerback.model.Priority;
import she.step.planerback.repository.PriorityRepositoryMongo;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@Qualifier("mongo")
public class PriorityDAOMongoImpl implements IPriorityDAO {

    private List<Priority> list = new ArrayList<>(Arrays.asList(
        new Priority  ( 1, "Низький", "#00e5dc"),
        new Priority ( 2, "Середній","#0017d1"),
        new Priority ( 3, "Високий", "#f11908"),
        new Priority( 4, "Дуже високий!!", "#000000"),
        new Priority(5,  "Без пріорітету", "rgba(133,133,133,0.51)")
    ));
    private final PriorityRepositoryMongo repository;

    @Autowired
    public PriorityDAOMongoImpl(PriorityRepositoryMongo repository) {
        this.repository = repository;
    }

   //@PostConstruct
    void init(){
       // repository.deleteAll();
        repository.saveAll(list);
    }

    @Override
    public Priority create(Priority priority) {
        Integer lastId = this.getAll().stream().mapToInt(Priority::getId).max().orElse(0);
        priority.setId(lastId + 1);
        return repository.save(priority);
    }

    @Override
    public Priority get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Priority update(Priority priority) {
        return repository.save(priority);
    }

    @Override
    public Priority delete(Integer id) {
        Priority priority = this.get(id);
        repository.deleteById(id);
        return priority;
    }

    @Override
    public List<Priority> getAll() {
        return repository.findAll();
    }
}
