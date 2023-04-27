@Repository
public interface IssuedBy22GstExcemptionRepository {

    List<IssuedBy22GstExcemption> findAll();

    Optional<IssuedBy22GstExcemption> findById(Long id);

    List<IssuedBy22GstExcemption> findByName(String name);

    List<IssuedBy22GstExcemption> findByDescription(String description);

    List<IssuedBy22GstExcemption> findByIssuer(String issuer);

    void save(IssuedBy22GstExcemption gstExcemption);

}