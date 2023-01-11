package ar.dev.leomartinez.portfoliobackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.dev.leomartinez.portfoliobackend.modelos.Usuario;
import ar.dev.leomartinez.portfoliobackend.service.IUserService;

@RestController
public class UserController {
    @Autowired
    private IUserService userServ;

    @GetMapping ("/usuarios/ver")
    public List<Usuario> obtenerUsuarios() {
        return userServ.obtenerUsuarios();
    }

    @PostMapping ("/usuarios/crear")
    public String crearUsuario (@RequestBody Usuario user) {
        userServ.crearUsuario(user);
        return "Usuario creado correctamente";
    }

    @DeleteMapping ("/usuarios/borrar/{id}")
    public String borrarUsuario (@PathVariable Long id) {
        userServ.borrarUsuario(id);
        return "Usuario eliminado correctamente";
    }

    @PutMapping ("usuarios/editar/{id}")
    public Usuario editarUsuario (  @PathVariable Long id,
                                    @RequestParam ("username") String nuevoUsername,
                                    @RequestParam ("password") String nuevaPassword) {
    Usuario user = userServ.obtenerUsuario(id);
    user.setUsername(nuevoUsername);
    user.setPassword(nuevaPassword);

    userServ.crearUsuario(user);
    return user;
    }

}
