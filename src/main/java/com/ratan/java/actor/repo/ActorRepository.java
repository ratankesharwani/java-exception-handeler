package com.ratan.java.actor.repo;

import com.ratan.java.actor.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
    List<Actor> findByLastName(String lastName);
}
