package she.step.planerback.dao.category.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import she.step.planerback.dao.category.interfaces.ICategoryDAO;
import she.step.planerback.model.Category;
import she.step.planerback.model.Priority;
import she.step.planerback.model.Task;
import she.step.planerback.repository.CategoryRepositoryMongo;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("mongoC")
public class CategoryDAOImpl implements ICategoryDAO {

    private List<Category> list = new ArrayList<>(Arrays.asList(
                    new Category(1, "авто", "car"),
                    new Category(2, "відпочинок", "rest"),
                    new Category(3, "навчання", "education"),
                    new Category(4, "спорт", "sport"),
                    new Category(5, "сім'я", "family")
    ));

    private final CategoryRepositoryMongo repository;

    @Autowired
    public CategoryDAOImpl(CategoryRepositoryMongo repository) {
        this.repository = repository;
    }

   // @PostConstruct
    void init () {
        repository.deleteAll();
        repository.saveAll(list);
    }

    @Override
    public Category create(Category category) {
        return repository.save(category);
    }

    @Override
    public Category get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return repository.save(category);
    }

    @Override
    public Category delete(Integer id) {
        Category category = this.get(id);
        repository.deleteById(id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }
}
