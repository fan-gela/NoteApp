package src.main.java.com.devmountain.noteApp.entities;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;
}

@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
@JsonManagedReference
private Set<Note> noteSet = new HashSet<>();