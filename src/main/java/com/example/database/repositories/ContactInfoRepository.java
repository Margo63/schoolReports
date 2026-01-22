package com.example.database.repositories;

import com.example.database.enteties.ContactInformation;
import org.springframework.data.repository.CrudRepository;

public interface ContactInfoRepository extends CrudRepository<ContactInformation, Long> {
}
