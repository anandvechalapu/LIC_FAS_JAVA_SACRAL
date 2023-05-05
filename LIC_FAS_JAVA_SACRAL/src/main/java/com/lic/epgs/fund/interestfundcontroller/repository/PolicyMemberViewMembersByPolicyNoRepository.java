@Repository
public interface PolicyMemberViewMembersByPolicyNoRepository extends JpaRepository<Member, Long> {
    
    @Query("SELECT m FROM Member m WHERE m.policyNo = :policyNo")
    List<Member> findMembersByPolicyNo(@Param("policyNo") String policyNo);
    
    @Query("SELECT m FROM Member m WHERE m.policyNo = :policyNo")
    Optional<Member> findMemberByPolicyNo(@Param("policyNo") String policyNo);
}