
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Info_personal;

public interface PersonaService {
    
    public List<Info_personal> ListarPersonas();
    
    public void guardarPersonal(Info_personal persona);
    
    public void eliminarPersonal(Info_personal persona);
    
    public Info_personal encontrarPersona(Info_personal persona);
}
