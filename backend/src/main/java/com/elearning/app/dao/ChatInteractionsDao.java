package com.elearning.app.dao;

import com.elearning.app.entity.ChatInteractions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ChatInteractionsDao extends JpaRepository<ChatInteractions, Long> {
    List<ChatInteractions> findByUserIdUser(Long idUser);

    // Puedes agregar más métodos de consulta personalizados aquí si es necesario.
}
