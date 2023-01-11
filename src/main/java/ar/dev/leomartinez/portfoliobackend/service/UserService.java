package ar.dev.leomartinez.portfoliobackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.dev.leomartinez.portfoliobackend.modelos.Usuario;
import ar.dev.leomartinez.portfoliobackend.repository.UserRepository;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userrepo;

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = userrepo.findAll();
        return listaUsuarios;
    }

    @Override
    public void crearUsuario(Usuario user) {
        userrepo.save(user);
        
    }

    @Override
    public void borrarUsuario(Long id) {
        userrepo.deleteById(id);
        
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        Usuario user = userrepo.findById(id).orElse(null);
        return user;
    }
}
