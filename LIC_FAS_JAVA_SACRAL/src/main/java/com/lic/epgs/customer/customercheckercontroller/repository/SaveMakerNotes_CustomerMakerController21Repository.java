package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SaveMakerNotes_CustomerMakerController21Repository extends JpaRepository<SaveMakerNotes_CustomerMakerController21, Long> {
    Optional<SaveMakerNotes_CustomerMakerController21> findByNoteId(Long noteId);
}