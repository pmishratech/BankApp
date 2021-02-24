package org.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import org.bankapp.model.Logger;

public interface LoggerRepository extends CrudRepository<Logger, Integer> {

}
