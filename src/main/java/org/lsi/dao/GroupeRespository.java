package org.lsi.dao;

import org.lsi.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeRespository extends JpaRepository<Groupe, Long> {
}
