package io.github.jrrickard.ws.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Participant {

    enum Gender {
        MALE,
        FEMALE
    }

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Gender gender;
    private String city;
    private String state;
}
