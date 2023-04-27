@Repository
public class DepositTransferNotesRepository {
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * This method is used to save the deposit transfer note in the database.
     * 
     * @param depositTransferNotesDto
     * @return ApiResponseDto
     * @throws ConstraintViolationException
     * @throws PersistenceException
     */
    public ApiResponseDto saveDepositnote(DepositTransferNotesDto depositTransferNotesDto) throws ConstraintViolationException, PersistenceException {
        ApiResponseDto apiResponseDto = new ApiResponseDto();
        try {
            depositTransferNotesDto.setCreatedOn(LocalDateTime.now());
            depositTransferNotesDto.setIsActive(true);
            entityManager.persist(depositTransferNotesDto);
            apiResponseDto.setTransactionStatus("SUCCESS");
            apiResponseDto.setTransactionMessage("Successfully saved deposit transfer note");
            apiResponseDto.setTransferId(depositTransferNotesDto.getTransferId());
        } catch (ConstraintViolationException e) {
            Logger.getLogger(DepositTransferNotesRepository.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            apiResponseDto.setTransactionStatus("ERROR");
            apiResponseDto.setTransactionMessage(e.getMessage());
        } catch (PersistenceException e) {
            Logger.getLogger(DepositTransferNotesRepository.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            apiResponseDto.setTransactionStatus("ERROR");
            apiResponseDto.setTransactionMessage(e.getMessage());
        }
        return apiResponseDto;
    }
}