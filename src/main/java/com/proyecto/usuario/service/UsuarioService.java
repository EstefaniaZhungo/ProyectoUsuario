package com.proyecto.usuario.service;

import java.util.List;

import com.proyecto.usuario.models.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario area);

	public Usuario findById(Long id);

	public void delete(Long id);
}
