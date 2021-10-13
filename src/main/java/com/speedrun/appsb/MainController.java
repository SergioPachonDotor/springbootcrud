package com.speedrun.appsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/api")
public class MainController {
    @Autowired
    private UsuarioRepository usuariorepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addUsuario( @RequestParam String REGIdentifica,
                                            @RequestParam String REGNombres,
                                            @RequestParam String REGApellidos,
                                            @RequestParam String REGCorreo,
                                            @RequestParam String REGMovil,
                                            @RequestParam String REGDireccion,
                                            @RequestParam String REGMunicipio){
        
        
        try {
            tabla1 Usuarito = new tabla1();
            Usuarito.setREGIdentifica(Integer.parseInt(REGIdentifica));
            Usuarito.setREGNombres(REGNombres);
            Usuarito.setREGApellidos(REGApellidos);
            Usuarito.setREGCorreo(REGCorreo);
            Usuarito.setREGMovil(Integer.parseInt(REGMovil));
            Usuarito.setREGDireccion(REGDireccion);
            Usuarito.setREGMunicipio(Integer.parseInt(REGMunicipio));
            usuariorepository.save(Usuarito);

        } catch (Exception e) {
            System.out.println(e);
        }
        return "ok";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<tabla1> getAllUsuarios(){
        return usuariorepository.findAll();
    }
}
