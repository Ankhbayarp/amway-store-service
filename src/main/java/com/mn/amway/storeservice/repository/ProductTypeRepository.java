
package com.mn.amway.storeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mn.amway.storeservice.model.ProductType;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

}