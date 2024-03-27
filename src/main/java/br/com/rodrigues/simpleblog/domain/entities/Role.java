package br.com.rodrigues.simpleblog.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public enum Values{
        ADMIN (1L),
        BASIC(2L);

        long id;

        Values(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }
    }
}
