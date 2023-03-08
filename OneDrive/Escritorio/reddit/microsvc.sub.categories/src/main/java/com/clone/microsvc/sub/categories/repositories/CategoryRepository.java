package com.clone.microsvc.sub.categories.repositories;

import com.clone.microsvc.sub.categories.models.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<SubCategory, Long> {
}
