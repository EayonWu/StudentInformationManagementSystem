package com.eayon.repository;

import com.eayon.model.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by Eayon on 16/12/13.
 */
public interface ClassRepository extends JpaRepository<ClassEntity, Integer> {
}
