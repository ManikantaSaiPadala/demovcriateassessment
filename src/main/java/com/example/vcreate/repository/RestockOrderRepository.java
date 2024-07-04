package com.example.vcreate.repository;

import com.example.vcreate.entity.RestockOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestockOrderRepository extends JpaRepository<RestockOrder, Long> {
}
