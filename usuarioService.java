package com.jvadev.cadastro_usuario.bussines;

    import com.jvadev.cadastro_usuario.infrastructure.entitys.usuario;
    import com.jvadev.cadastro_usuario.infrastructure.repository.UsuarioRepository;
    import org.springframework.stereotype.Repository;
    import org.springframework.stereotype.Service;

    import javax.swing.*;

    import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
    public class usuarioService {


    private final UsuarioRepository repository;


    public usuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarusuario(usuario usuario) {
        repository.saveAllAndFlush(usuario);

    }

    public usuario buscarUsuariosPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não econtrado")
        );
    }
}
