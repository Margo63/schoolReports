package com.example.database.repositories;

import com.example.database.dto.Unit1Response;
import com.example.database.enteties.Unit1;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface Unit1Repository extends CrudRepository<Unit1, Long> {

    @Query(value = """
            SELECT
                        COALESCE(SUM(u.organization_type), 0) AS totalOrgType,
                        COALESCE(SUM(u.terrain_type), 0) AS totalTerrainType
                    FROM main_info mi
                    LEFT JOIN unit1 u ON mi.id = u.id
                    Where mi.organization_name = :organizationName
                    """,
            nativeQuery = true
    )
    Unit1Response countByOrganizationName(@Param("organizationName") String organizationName);
}
