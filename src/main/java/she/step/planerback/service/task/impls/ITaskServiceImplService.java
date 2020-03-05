package she.step.planerback.service.task.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import she.step.planerback.dao.task.interfaces.ITaskDAO;
import she.step.planerback.model.Task;
import she.step.planerback.service.task.interfaces.ITaskServiceService;

import java.util.List;

@Service
public class ITaskServiceImplService implements ITaskServiceService {

    private final ITaskDAO dao;

    @Autowired
    public ITaskServiceImplService(@Qualifier("mongoT") ITaskDAO dao) {
        this.dao = dao;
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
