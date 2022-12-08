package com.ittg.api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface empleadoRepository extends JpaRepository<empleados, Long> {

}
