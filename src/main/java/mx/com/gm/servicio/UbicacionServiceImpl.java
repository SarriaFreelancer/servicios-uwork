
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.UbicacionDao;
import mx.com.gm.domain.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UbicacionServiceImpl implements UbicacionService {
    
    @Autowired
    private UbicacionDao ubicacionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Ubicacion> ListarUbicaciones() {
        return (List<Ubicacion>) ubicacionDao.findAll();
    }

    @Override
    @Transactional
    public void guardarUbicacion(Ubicacion ubicacion) {
        ubicacionDao.save(ubicacion);
    }

    @Override
    @Transactional
    public void eliminarUbicacion(Ubicacion ubicacion) {
        ubicacionDao.delete(ubicacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Ubicacion encontrarUbicaciones(Ubicacion ubicacion) {
        return ubicacionDao.findById(ubicacion.getId_ubicacion()).orElse(null);
    }
    
}
