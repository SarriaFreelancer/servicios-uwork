
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Servicios;

public interface ServicioService {
    
    public List<Servicios> ListarServicios();
    
    public void guardarServicio(Servicios servicio);
    
    public void eliminarServicio(Servicios servicio);
    
    public Servicios encontrarServicio(Servicios servicio);
}
