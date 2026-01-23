package com.example.database.repositories;

import com.example.database.enteties.Unit4;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Unit4Repository extends CrudRepository<Unit4, Long> {
    @Query(value = "SELECT u.* FROM Unit4 u JOIN main_info mi ON u.id = mi.id WHERE mi.organization_name = :organizationName",
            nativeQuery = true
    )
    List<Unit4> findByOrganizationName(@Param("organizationName") String organizationName);
}
