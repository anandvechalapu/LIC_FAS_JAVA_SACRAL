@Repository
public interface LineOfBusinessListRepository {
     
     List<ProductVariants> getLineOfBusinessList(Integer lineOfBusinessId);

}