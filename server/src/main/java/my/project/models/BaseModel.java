package my.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

import static java.util.Objects.isNull;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id
    private Long id;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @PrePersist
    public void prePersist() {
        if(isNull(this.created_at))
            this.created_at = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updated_at = LocalDateTime.now();
    }
}
