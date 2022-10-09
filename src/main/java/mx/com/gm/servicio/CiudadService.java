package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Ciudad;

public interface CiudadService {

    public List<Ciudad> ListarCiudades();

    public void guardarCiudad(Ciudad ciudad);

    public void eliminarCiudad(Ciudad ciudad);

    public Ciudad encontrarCiudades(Ciudad ciudad);
}
