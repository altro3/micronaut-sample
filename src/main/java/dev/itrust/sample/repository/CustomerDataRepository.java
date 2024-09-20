package dev.itrust.sample.repository;

import dev.itrust.sample.model.CustomerData;
import dev.itrust.sample.model.VersionedId2;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 19.09.2024
 */
@Repository
public interface CustomerDataRepository extends CrudRepository<CustomerData, VersionedId2> {
}
