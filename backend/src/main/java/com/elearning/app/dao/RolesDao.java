package com.elearning.app.dao;

import com.elearning.app.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RolesDao extends JpaRepository<Roles, Long> {
    Optional<Roles> findByRoleName(String roleName);

    // Agrega cualquier método adicional que necesites para consultar roles.
}
