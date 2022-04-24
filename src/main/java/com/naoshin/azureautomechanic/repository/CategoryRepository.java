package com.naoshin.azureautomechanic.repository;

import com.naoshin.azureautomechanic.model.CarCategory;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CarCategory,Integer> {

}
