package com.ratan.java.actor.service;

import com.ratan.java.actor.entity.Actor;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ActorService {
    List<Actor> getAllActors();

    Optional<Actor> getActorById(Integer id);

    Actor createActor(Actor actor);

    Actor updateActor(Integer id, Actor updatedActor);

    void deleteActor(Integer id);

    Page<Actor> getActorsWithPagination(Pageable pageable);
}
