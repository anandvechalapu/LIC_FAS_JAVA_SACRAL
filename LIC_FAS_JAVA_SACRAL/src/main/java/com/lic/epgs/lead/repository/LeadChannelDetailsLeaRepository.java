@Repository
public interface LeadChannelDetailsLeaRepository extends JpaRepository<LeadChannelDetailsLea, Long> {
    
    LeadChannelDetailsLea save(LeadChannelDetailsLea leadChannelDetailsLea);
    
    LeadChannelDetailsLeaDto findByMOcodeAndMOnameAndIntermediaryCodeAndIntermediaryNameAndIntermediaryContactNumberAndIntermediaryEmailAddress(String MOcode, String MOname, String intermediaryCode, String intermediaryName, String intermediaryContactNumber, String intermediaryEmailAddress);
    
    LeadChannelDetailsLea findByIdAndActiveTrue(Long id);
    
    List<LeadChannelDetailsLea> findAllByActiveTrue();
    
    LeadChannelDetailsLea markAsActive(Long id);
    
    LeadChannelDetailsLea markAsInactive(Long id);
}