package io.github.jrrickard.ws.persistence;

import io.github.jrrickard.ws.model.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, String> {
}
