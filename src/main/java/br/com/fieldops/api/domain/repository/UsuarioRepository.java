package br.com.fieldops.api.domain.repository;

import br.com.fieldops.api.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // ⭐ Retorna Optional<Usuario> para ser usado com orElseThrow()
    Optional<Usuario> findByEmail(String email);
    
    // Método auxiliar para verificar se email existe
    boolean existsByEmail(String email);
}