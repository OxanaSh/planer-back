package she.step.planerback.service.category.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import she.step.planerback.dao.category.interfaces.ICategoryDAO;
import she.step.planerback.model.Category;
import she.step.planerback.service.category.interfaces.ICategoryServiceService;

import java.util.List;

@Service
public class ICategoryServiceImplService implements ICategoryServiceService {

    private final ICategoryDAO dao;

    @Autowired
    public ICategoryServiceImplService(@Qualifier("mongoC") ICategoryDAO dao) {
        this.dao = dao;
    }

    @Override
    public Category create(Category category) {
        return dao.create(category);
    }

    @Override
    public Category get(Integer id) {
        return dao.get(id);
    }

    @Override
    public Category update(Category category) {
        return dao.update(category);
    }

    @Override
    public Category delete(Integer id) {
        return dao.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return dao.getAll();
    }
}
