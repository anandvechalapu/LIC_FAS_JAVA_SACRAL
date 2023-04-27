@Repository
public interface SaveCommissionNotes11CommissionRepository extends JpaRepository<CommissionNotes11Commission, Long> {

    //Deactivates the commission notes object with the given ID and updates the modified date and user
    @Modifying
    @Query("UPDATE CommissionNotes11Commission c SET c.active = false, c.modifiedDate = :modifiedDate, c.modifiedUser = :modifiedUser WHERE c.commissionId = :commissionId")
    void deactivateCommissionNotes11Commission(@Param("commissionId") Long commissionId, 
                                             @Param("modifiedDate") LocalDateTime modifiedDate, 
                                             @Param("modifiedUser") Long modifiedUser);
    
    //Creates a new commission notes object
    @Transactional
    CommissionNotes11Commission save(CommissionNotes11Commission commissionNotes11Commission);
    
    //Returns the commission notes object with the given ID
    Optional<CommissionNotes11Commission> findById(Long commissionId);
    
    //Returns a response object with the commission ID, commission notes object and a success message
    @Query("SELECT new com.lic.epgs.commission.response.CommissionNotes11CommissionResponse(c.commissionId, c, 'Successful') FROM CommissionNotes11Commission c WHERE c.commissionId = :commissionId")
    CommissionNotes11CommissionResponse findResponseById(@Param("commissionId") Long commissionId);
}