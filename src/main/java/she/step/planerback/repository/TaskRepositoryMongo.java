package she.step.planerback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import she.step.planerback.model.Task;

@Repository
public interface TaskRepositoryMongo extends MongoRepository<Task, Integer> {
}

