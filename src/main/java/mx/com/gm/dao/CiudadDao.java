
package mx.com.gm.dao;

import mx.com.gm.domain.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadDao extends CrudRepository<Ciudad, Long> {
    
}
