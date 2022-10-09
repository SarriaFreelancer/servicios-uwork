
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ubicacion")
public class Ubicacion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ubicacion;
    private String barrio;
    private Integer id_ciudad;
    
    //private String nombre_ciudad;
    //private String depto;
    
}
