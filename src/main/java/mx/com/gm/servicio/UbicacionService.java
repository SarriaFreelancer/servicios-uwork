
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Ubicacion;

public interface UbicacionService {
    
    public List<Ubicacion> ListarUbicaciones();
    
    public void guardarUbicacion(Ubicacion ubicacion);
    
    public void eliminarUbicacion(Ubicacion ubicacion);
    
    public Ubicacion encontrarUbicaciones(Ubicacion ubicacion);
}
