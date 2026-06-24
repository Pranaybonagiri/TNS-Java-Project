
package com.tnsif.crudkprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.crudkprit.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No extra code needed; JpaRepository provides all CRUD methods
}
