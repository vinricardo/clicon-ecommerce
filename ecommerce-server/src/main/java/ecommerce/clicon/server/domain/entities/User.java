package ecommerce.clicon.server.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "usuarios", name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
}
