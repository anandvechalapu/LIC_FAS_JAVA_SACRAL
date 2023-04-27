import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.dto.CommonResponseDto;
import com.lic.epgs.gstexcemption.entity.CategoryGSTNonApplicability20;

@Repository
public interface CategoryGSTNonApplicability20Repository extends JpaRepository<CategoryGSTNonApplicability20, Long> {

	@Query("SELECT new com.lic.epgs.gstexcemption.dto.CommonResponseDto(c.gstNonApplicabilityCategory) FROM CategoryGSTNonApplicability20 c")
	public List<CommonResponseDto> getGSTNonApplicabilityCategories();

}