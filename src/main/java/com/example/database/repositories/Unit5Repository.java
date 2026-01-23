package com.example.database.repositories;

import com.example.database.enteties.Unit5;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Unit5Repository extends CrudRepository<Unit5, Long> {
    @Query(value = "SELECT u.* FROM Unit5 u JOIN main_info mi ON u.id = mi.id WHERE mi.organization_name = :organizationName",
            nativeQuery = true
    )
    List<Unit5> findByOrganizationName(@Param("organizationName") String organizationName);
}
