package tmg.ohiggins.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tmg.ohiggins.api.Model.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota,Integer> {

}
