package com.example.PetrolPump.Backend.Repository;

import com.example.PetrolPump.Backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
