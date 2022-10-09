
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ServiciosDao;
import mx.com.gm.domain.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioServiceImpl implements ServicioService{
    
    @Autowired
    private ServiciosDao servicioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Servicios> ListarServicios() {
        return (List<Servicios>) servicioDao.findAll();
    }

    @Override
    @Transactional
    public void guardarServicio(Servicios servicio) {
        servicioDao.save(servicio);
    }

    @Override
    @Transactional
    public void eliminarServicio(Servicios servicio) {
        servicioDao.delete(servicio);
    }

    @Override
    @Transactional(readOnly = true)
    public Servicios encontrarServicio(Servicios servicio) {
        return servicioDao.findById(servicio.getId_servicio()).orElse(null);
    }
    
}
