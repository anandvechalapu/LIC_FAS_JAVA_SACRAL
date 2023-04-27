@Repository
public interface GstExcemptionRepository {

	/**
	 * Retrieve the GST details of a policy based on its proposal number
	 * 
	 * @param proposalNumber the proposal number
	 * @return GST policy details
	 */
	GstPolicyNumberDto getGstByProposalNo(String proposalNumber);

}