package tmg.ohiggins.api.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tmg.ohiggins.api.Model.Anotacion;

@Repository
public interface AnotacionRepository extends JpaRepository<Anotacion, Integer> {

}
