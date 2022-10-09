
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "info_personal")
public class Info_personal implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;
    
    @NotEmpty
    private String imagen;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellidos;
    
    @NotEmpty
    @Email
    private String e_mail;
    
    @NotEmpty
    private String telefono;
    
    @NotEmpty
    private String experiencia_anual;
    
    @NotEmpty
    private String servicio;
    
    @NotEmpty
    private String ciudad;
    
    //private String nombre_servicio;
    //private Double tarifa_min;
    //private Double tarifa_max;
    
    //private String barrio;
    
    //private Integer id_ciudad;
    //private String nombre_ciudad;
    //private String depto;
    
}
