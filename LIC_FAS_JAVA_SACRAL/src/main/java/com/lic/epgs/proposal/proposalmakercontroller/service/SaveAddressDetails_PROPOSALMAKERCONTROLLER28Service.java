@Service
public class SaveAddressDetails_PROPOSALMAKERCONTROLLER28Service {

    private final SaveAddressDetails_PROPOSALMAKERCONTROLLER28Repository saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository;

    public SaveAddressDetails_PROPOSALMAKERCONTROLLER28Service(SaveAddressDetails_PROPOSALMAKERCONTROLLER28Repository saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository) {
        this.saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository = saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository;
    }

    public MPHAddressDetailsTempEntity findByAddressDetailsDto(MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.findByAddressDetailsDto(addressDetailsDto);
    }

    public int updateStatusAndMessageByAddressDetailsDto(String status, String message, MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.updateStatusAndMessageByAddressDetailsDto(status, message, addressDetailsDto);
    }

    public int deleteByAddressDetailsDto(MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.deleteByAddressDetailsDto(addressDetailsDto);
    }

}