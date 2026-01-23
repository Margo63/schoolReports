package com.example.database.repositories;

import com.example.database.dto.Unit6Response;
import com.example.database.enteties.Unit6;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Unit6Repository extends CrudRepository<Unit6, Long> {
    @Query(value = """
            SELECT
                        COALESCE(SUM(u.hiking), 0) AS hiking,
                        COALESCE(SUM(u.excursions), 0) AS excursions,
                        COALESCE(SUM(u.in_field_expeditions), 0) AS inFieldExpeditions
                    FROM main_info mi
                    LEFT JOIN unit6 u ON mi.id = u.id
                    Where mi.organization_name = :organizationName
                    """,
            nativeQuery = true
    )
    Unit6Response sumAllByOrganizationName(@Param("organizationName") String organizationName);

}
