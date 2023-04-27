package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionDetailsDto, Long>{

    public CommonCommissionDto loadCommissionDetails() throws PersistenceException, ConstraintViolationException;
}