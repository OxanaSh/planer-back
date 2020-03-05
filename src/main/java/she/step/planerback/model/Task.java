package she.step.planerback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document
public class Task {

    @Id
    private Integer id;
    private String name;
    private boolean completed;
    private Priority priority;
    private Category category;
    private LocalDate date;


    public Task() {
    }

    public Task(String name, boolean completed, Priority priority, Category category, LocalDate date) {
        this.name = name;
        this.completed = completed;
        this.priority = priority;
        this.category = category;
        this.date = date;
    }


    public Task(Integer id, String name, boolean completed, Priority priority, Category category, LocalDate date) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.priority = priority;
        this.category = category;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(getId(), task.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", completed=" + completed +
                ", priority=" + priority +
                ", category=" + category +
                ", date=" + date +
                '}';
    }
}
