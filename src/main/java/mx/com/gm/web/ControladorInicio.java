package mx.com.gm.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Info_personal;
import mx.com.gm.servicio.CiudadService;
import mx.com.gm.servicio.PersonaService;
import mx.com.gm.servicio.ServicioService;
import mx.com.gm.servicio.UbicacionService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private ServicioService servicioService;
    
    @Autowired
    private UbicacionService ubicacionService;
    
    @Autowired
    private CiudadService ciudadService;
   
    @GetMapping("/") 
    public String inicio(Model model, @AuthenticationPrincipal User user){
        
        var personas = personaService.ListarPersonas();
        var servicios = servicioService.ListarServicios();
        var ubicacion = ubicacionService.ListarUbicaciones();
        var ciudad = ciudadService.ListarCiudades();
     
        log.info("ejecutando el controlador MVC");
        log.info("Usuario que hizo login: "+ user);
        model.addAttribute("personas", personas);
        model.addAttribute("servicios", servicios);
        model.addAttribute("ubicacion", ubicacion);
        model.addAttribute("ciudad", ciudad);
        return "index";
    }
    
    @GetMapping("/agregar") 
    public String agregar(Info_personal persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Info_personal persona, Errors errores, Model model){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaService.guardarPersonal(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_empleado}")
    public String editar(Info_personal persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("info_personal", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Info_personal persona){
        personaService.eliminarPersonal(persona);
        return "redirect:/";
    }
}
