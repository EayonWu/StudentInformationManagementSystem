package com.eayon.repository;

import com.eayon.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Eayon on 16/12/14.
 */
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
