package com.example.amazon;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class  AmazonSer {
    @Autowired
    private AmazonRepository sr;

    public void save( Amazon Ama1)
    {
        sr.save(Ama1);
    }

    public List<Amazon> view(){
        
        return sr.findAll();
    }

    public Amazon getById(int id)
    {
        Optional<Amazon> optional = sr.findById(id);
        Amazon employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
    }
 
    
    public void deleteViaId(int id)
    {
        sr.deleteById(id);
    }
}