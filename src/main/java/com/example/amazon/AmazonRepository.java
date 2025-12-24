package com.example.amazon;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;


public interface AmazonRepository extends JpaRepository<Amazon,Integer>

 {
    
}
