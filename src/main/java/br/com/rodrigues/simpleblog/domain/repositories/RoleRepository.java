package br.com.rodrigues.simpleblog.domain.repositories;

import br.com.rodrigues.simpleblog.domain.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
