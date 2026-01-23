package com.example.database.repositories;

import com.example.database.enteties.Unit7;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Unit7Repository extends CrudRepository<Unit7, Long> {

    @Query(value = "SELECT u.* FROM Unit7 u JOIN main_info mi ON u.id = mi.id WHERE mi.organization_name = :organizationName",
            nativeQuery = true
    )
    List<Unit7> findByOrganizationName(@Param("organizationName") String organizationName);
}
