@Service
public class ViewLeadLead23Service {

    private ViewLeadLead23Repository viewLeadLead23Repository;
 
    public ViewLeadLead23Service(ViewLeadLead23Repository viewLeadLead23Repository) {
        this.viewLeadLead23Repository = viewLeadLead23Repository;
    }
    
    public CommonLeadDto getLeadBasicDetails() {
        return viewLeadLead23Repository.getLeadBasicDetails();
    }
    
    public List<ProductDetailsDto> getProductDetails() {
        return viewLeadLead23Repository.getProductDetails();
    }
    
    public List<ChannelDetailsDto> getChannelDetails() {
        return viewLeadLead23Repository.getChannelDetails();
    }
    
    public List<ActivityDetailsDto> getActivityDetails() {
        return viewLeadLead23Repository.getActivityDetails();
    }
 
    public boolean updateRejectionRemarks(String remarks) {
        return viewLeadLead23Repository.updateRejectionRemarks(remarks);
    }
}