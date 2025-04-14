package com.mycompany.obitemservice.repository;

import com.mycompany.obitemservice.model.ItemCategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemCategoryRepository extends MongoRepository<ItemCategoryModel, String> {
}
