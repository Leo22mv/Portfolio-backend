package ar.dev.leomartinez.portfoliobackend.service;

import java.util.List;

import ar.dev.leomartinez.portfoliobackend.modelos.Usuario;

public interface IUserService {
    public List<Usuario> obtenerUsuarios();
    public void crearUsuario(Usuario user);
    public void borrarUsuario(Long id);
    public Usuario obtenerUsuario(Long id);
}
