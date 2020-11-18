package com.venem.venem.model;




import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="tb_user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String email;

    private String password;

    /*@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyy")
    private LocalDateTime data;
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
