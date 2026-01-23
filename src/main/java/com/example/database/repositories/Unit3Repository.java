package com.example.database.repositories;

import com.example.database.enteties.Unit3;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Unit3Repository extends CrudRepository<Unit3, Long> {

    @Query(value = "SELECT u.* FROM Unit3 u JOIN main_info mi ON u.id = mi.id WHERE mi.organization_name = :organizationName",
            nativeQuery = true
    )
    List<Unit3> findByOrganizationName(@Param("organizationName") String organizationName);
}
