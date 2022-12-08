package com.example.patientapp_backend.dao;

import com.example.patientapp_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,String> {

    @Query(value = "SELECT `id`, `address`, `date_of_appointment`, `doctor_name`, `mobile`, `name` FROM `patient` WHERE `name`LIKE %:name%",nativeQuery = true)
    List<Patient>SearchPatient(@Param("name")String name);

    @Modifying
    @Transactional

    @Query(value = "DELETE FROM `patient` WHERE `id`=:id",nativeQuery = true)
    void DeletePatient(@Param("id")Integer id);
}
