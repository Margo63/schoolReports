package com.example.database.repositories;

import com.example.database.enteties.Unit8;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Unit8Repository extends CrudRepository<Unit8, Long> {
    @Query(value = "SELECT u.* FROM Unit8 u JOIN main_info mi ON u.id = mi.id WHERE mi.organization_name = :organizationName",
            nativeQuery = true
    )
    List<Unit8> findByOrganizationName(@Param("organizationName") String organizationName);
}
