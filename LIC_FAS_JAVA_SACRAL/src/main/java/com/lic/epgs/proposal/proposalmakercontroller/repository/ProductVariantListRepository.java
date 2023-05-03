@Repository
public interface ProductVariantListRepository extends JpaRepository<ProductVariant, Long> {
 
    @Query("SELECT pv FROM ProductVariant pv WHERE pv.productId = :productId")
    List<ProductVariant> getProductVariantList_PROPOSALMAKERCONTROLLER13(@Param("productId") Long productId);

}