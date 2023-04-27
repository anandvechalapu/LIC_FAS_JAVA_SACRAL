@Repository
public class GSTExcemptionRepository {
	
	public List<GstExcemptionDto> searchforInProgress(String loginUser, String unitCode, String gstNo, String proposalNo) {
		try {
			if (loginUser.equals("GST Checker")) {
				return gstCheckerSearchInProgress(unitCode, gstNo, proposalNo);
			} else if (loginUser.equals("GST Approver")) {
				return mapEntity(unitCode, gstNo, proposalNo);
			}
		} catch (Exception e) {
			return new ArrayList<GstExcemptionDto>() {{
				add(new GstExcemptionDto() {{
					setTransactionMessage("FAIL");
					setTransactionStatus("ERROR");
				}});
			}};
		}
		return new ArrayList<>();
	}
	
	private List<GstExcemptionDto> gstCheckerSearchInProgress(String unitCode, String gstNo, String proposalNo) {
		// TODO: implement method
		return null;
	}
	
	private List<GstExcemptionDto> mapEntity(String unitCode, String gstNo, String proposalNo) {
		// TODO: implement method
		return null;
	}
}