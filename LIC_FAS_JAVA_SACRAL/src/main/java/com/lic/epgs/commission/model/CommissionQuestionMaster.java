package com.lic.epgs.commission.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "com_commission_question_master")
public class CommissionQuestionMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_master_id", nullable = false)
    private Long questionMasterId;

    @NotNull
    @Column(name = "question", nullable = false)
    private String question;

    @NotNull
    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    public Long getQuestionMasterId() {
        return questionMasterId;
    }

    public void setQuestionMasterId(Long questionMasterId) {
        this.questionMasterId = questionMasterId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}