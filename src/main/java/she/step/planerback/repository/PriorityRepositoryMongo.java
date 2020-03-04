package she.step.planerback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import she.step.planerback.model.Priority;

@Repository
public interface PriorityRepositoryMongo extends MongoRepository<Priority, Integer> {
}
