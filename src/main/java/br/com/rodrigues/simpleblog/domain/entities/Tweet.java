package br.com.rodrigues.simpleblog.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table( name = "tb_tweets")
public class Tweet {

    @Id @GeneratedValue ( strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    private String content;

    @CreationTimestamp
    private Instant createdAt;
}
