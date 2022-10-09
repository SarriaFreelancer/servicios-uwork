
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.CiudadDao;
import mx.com.gm.domain.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CiudadServiceImpl implements CiudadService {
    
    @Autowired
    private CiudadDao ciudadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> ListarCiudades() {
        return (List<Ciudad>) ciudadDao.findAll();
    }

    @Override
    @Transactional
    public void guardarCiudad(Ciudad ciudad) {
        ciudadDao.save(ciudad);
    }

    @Override
    @Transactional
    public void eliminarCiudad(Ciudad ciudad) {
        ciudadDao.save(ciudad);
    }

    @Override
    @Transactional(readOnly = true)
    public Ciudad encontrarCiudades(Ciudad ciudad) {
        return ciudadDao.findById(ciudad.getId_ciudad()).orElse(null);
    }
    
}
