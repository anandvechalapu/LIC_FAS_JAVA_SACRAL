@Repository
public interface GstAllDetailsByGstId9GstExcemptionRepository extends JpaRepository<GstExcemptionDto, Long> {

    @Query("SELECT gst FROM GstExcemptionDto gst WHERE gst.gstExcemptionId = :gstExcemptionId")
    GSTResponseDto<GstExcemptionDto> getAllDetailsByGstId(@Param("gstExcemptionId") Long gstExcemptionId);
}