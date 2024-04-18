package crud.Repository;

import crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<Produto, Integer> {
}
