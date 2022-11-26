package com.university.task5University;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoUserDAO  extends CrudRepository<TableCounter, Integer> {
}
