@Repository
public interface SaveAddressDetails_PROPOSALMAKERCONTROLLER28Repository extends JpaRepository<MPHAddressDetailsTempEntity, Long> {

    @Query("SELECT entity FROM MPHAddressDetailsTempEntity entity WHERE entity.addressDetailsDto = :MPHAddressDetailsDto")
    MPHAddressDetailsTempEntity findByAddressDetailsDto(@Param("MPHAddressDetailsDto") MPHAddressDetailsDto addressDetailsDto);

    @Modifying
    @Query("UPDATE MPHAddressDetailsTempEntity entity SET entity.status = :status, entity.message = :message WHERE entity.addressDetailsDto = :MPHAddressDetailsDto")
    int updateStatusAndMessageByAddressDetailsDto(@Param("status") String status, @Param("message") String message, @Param("MPHAddressDetailsDto") MPHAddressDetailsDto addressDetailsDto);

    @Transactional
    @Modifying
    @Query("DELETE FROM MPHAddressDetailsTempEntity entity WHERE entity.addressDetailsDto = :MPHAddressDetailsDto")
    int deleteByAddressDetailsDto(@Param("MPHAddressDetailsDto") MPHAddressDetailsDto addressDetailsDto);

}