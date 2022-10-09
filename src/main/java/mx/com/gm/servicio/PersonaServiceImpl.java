
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.InfoPersonalDao;
import mx.com.gm.domain.Info_personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private InfoPersonalDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Info_personal> ListarPersonas() {
       return (List<Info_personal>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarPersonal(Info_personal persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminarPersonal(Info_personal persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Info_personal encontrarPersona(Info_personal persona) {
        return personaDao.findById(persona.getId_empleado()).orElse(null);
    }
    
}
