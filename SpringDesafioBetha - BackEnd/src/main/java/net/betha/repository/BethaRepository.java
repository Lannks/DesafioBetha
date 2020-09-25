package net.betha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.betha.model.Employee;

@Repository
public interface BethaRepository extends JpaRepository<Employee, Long> {

}
