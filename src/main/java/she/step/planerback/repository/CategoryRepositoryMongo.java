package she.step.planerback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import she.step.planerback.model.Category;

@Repository
public interface CategoryRepositoryMongo extends MongoRepository<Category, Integer> {
}
