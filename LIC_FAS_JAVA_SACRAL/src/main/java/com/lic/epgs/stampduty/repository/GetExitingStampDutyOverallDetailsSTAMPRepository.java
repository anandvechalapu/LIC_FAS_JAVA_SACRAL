@Repository
public interface GetExitingStampDutyOverallDetailsSTAMPRepository extends JpaRepository<StampDutyEntity, Long> {
    
    // get Stamp Duty Entity
    @Query("select s from StampDutyEntity s where s.id = :stampId")
    StampDutyEntity getStampDutyEntity(@Param("stampId") Long stampId);
    
    // get list of Stamp Duty Consumer Units
    @Query("select scu from StampDutyEntity scu where scu.id = :stampId")
    List<StampDutyConsumerUnit> getStampDutyConsumerUnit(@Param("stampId") Long stampId);
    
    // get list of Stamp Duty Notes
    @Query("select sn from StampDutyEntity sn where sn.id = :stampId")
    List<StampDutyNote> getStampDutyNote(@Param("stampId") Long stampId);
    
    // get note content
    @Query("select sn.noteContent from StampDutyEntity sn where sn.id = :stampId")
    String getNoteContent(@Param("stampId") Long stampId);
    
    // get created by
    @Query("select sn.createdBy from StampDutyEntity sn where sn.id = :stampId")
    String getCreatedBy(@Param("stampId") Long stampId);
    
    // get modified by
    @Query("select sn.modifiedBy from StampDutyEntity sn where sn.id = :stampId")
    String getModifiedBy(@Param("stampId") Long stampId);
    
    // get created on
    @Query("select sn.createdOn from StampDutyEntity sn where sn.id = :stampId")
    Date getCreatedOn(@Param("stampId") Long stampId);
    
    // get modified on
    @Query("select sn.modifiedOn from StampDutyEntity sn where sn.id = :stampId")
    Date getModifiedOn(@Param("stampId") Long stampId);
    
    // get active status
    @Query("select sn.active from StampDutyEntity sn where sn.id = :stampId")
    Boolean getActiveStatus(@Param("stampId") Long stampId);
    
}