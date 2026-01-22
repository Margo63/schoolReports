package com.example.database.repositories;

import com.example.database.enteties.MainInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MainInfoRepository extends CrudRepository<MainInfo, Long> {

    @Query(value = """
            SELECT * FROM main_info
            ORDER BY id ASC
            LIMIT :#{#pageable.pageSize} OFFSET :#{#pageable.offset}
        """,
            countQuery = "SELECT COUNT(*) FROM main_info",
            nativeQuery = true)
    Page<MainInfo> findAllProjected(Pageable pageable);

}
