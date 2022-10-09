
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class Servicios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_servicio;
    private String nombre_servicio;
    private Double tarifa_min;
    private Double tarifa_max;
    
    //private String barrio;
    
    //private Integer id_ciudad;
    //private String nombre_ciudad;
    //private String depto;
    
}
