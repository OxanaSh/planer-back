package she.step.planerback.dao.priority.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import she.step.planerback.dao.priority.interfaces.IPriorityDAO;
import she.step.planerback.model.Priority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("fake")
public class PriorityDAOFakeImpl implements IPriorityDAO {




    private List<Priority> list = new ArrayList<>(Arrays.asList(
            new Priority(1, "Orange", "red"),
            new Priority(2, "Ultra", "blue"),
            new Priority(3, "Green", "black")
    ));


    @Override
    public Priority create(Priority priority) {
        return null;
    }

    @Override
    public Priority get(Integer id) {
        return null;
    }

    @Override
    public Priority update(Priority priority) {
        return null;
    }

    @Override
    public Priority delete(Integer id) {
        return null;
    }

    @Override
    public List<Priority> getAll() {
        return list;
    }
}
