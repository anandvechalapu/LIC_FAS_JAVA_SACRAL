@Repository
public interface SaveLeadProductDetails_LEAD18Repository extends JpaRepository<LeadProductDetailsTempEntity, Long> {

    LeadProductDetailsTempEntity save(LeadProductDetailsDto leadProductDetailsDto);
    CommonLeadDto saveAndReturnCommonLeadDto(LeadProductDetailsDto leadProductDetailsDto);

}