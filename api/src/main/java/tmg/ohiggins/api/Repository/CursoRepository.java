package tmg.ohiggins.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tmg.ohiggins.api.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    
}
