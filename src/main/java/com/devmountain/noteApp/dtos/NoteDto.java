package src.main.java.com.devmountain.noteApp.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable {
    private Long id;
    private String username;
    private String password;

    public NoteDto(Note note) {
        if (not.getId() != null) {
            this.id = note.getId();
        } if (note.getBody() != null) {
            this.body = note.getBody();
        }
    }
}
