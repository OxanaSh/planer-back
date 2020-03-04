package she.step.planerback.service.priority.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import she.step.planerback.dao.priority.impls.PriorityDAOMongoImpl;
import she.step.planerback.dao.priority.interfaces.IPriorityDAO;
import she.step.planerback.model.Priority;
import she.step.planerback.service.priority.interfaces.IPriorityServiceService;

import java.util.List;

@Service
public class PriorityServiceImpl implements IPriorityServiceService {


    private final IPriorityDAO dao;

    @Autowired
    public PriorityServiceImpl(@Qualifier("mongo") IPriorityDAO dao) {
        this.dao = dao;
    }

    @Override
    public Priority create(Priority priority) {
        return dao.create(priority);
    }

    @Override
    public Priority get(Integer id) {
        return dao.get(id);
    }

    @Override
    public Priority update(Priority priority) {
        return dao.update(priority);
    }

    @Override
    public Priority delete(Integer id) {
        return dao.delete(id);
    }

    @Override
    public List<Priority> getAll() {
        return dao.getAll();
    }
}
