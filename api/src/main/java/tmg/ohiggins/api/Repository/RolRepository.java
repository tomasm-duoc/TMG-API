package tmg.ohiggins.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tmg.ohiggins.api.Model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

}
