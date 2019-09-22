package Application.repository;

import Application.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentsRepository extends JpaRepository<Parent, Integer> {
}
