package com.elearning.app.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chat_interactions")
public class ChatInteractions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChatInteraction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private Users user;

    @Column(nullable = false)
    private Timestamp interactionTime;

    @Lob
    @Column(nullable = false)
    private String userQuestion;

    @Lob
    @Column(nullable = false)
    private String gptResponse;

    // Optional: If you want to include the initial query response.
    @Lob
    private String initialQueryResponse;

}
