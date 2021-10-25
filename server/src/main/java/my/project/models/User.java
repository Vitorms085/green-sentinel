package my.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "USER")
public class User extends BaseModel {

    private String user;

    private String password;

    private String email;
}