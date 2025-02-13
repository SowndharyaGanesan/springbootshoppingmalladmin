package com.ShoppingMallAdmin.ShoppingMallAdmin_simple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Ensure the 'Admin' entity exists in the correct package
import com.ShoppingMallAdmin.ShoppingMallAdmin_simple.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {}
