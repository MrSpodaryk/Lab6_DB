//package ua.lviv.iot.domain;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "vacancy_info_has_user_info", schema = "Spodaryk_db", catalog = "")
//public class VacancyInfoHasUserInfo {
//    private int vacancyInfoId;
//    private int userInfoId;
//    private String comment;
//    private Boolean approve;
//    private VacancyInfo vacancyInfoByVacancyInfoId;
//    private UserInfo userInfoByUserInfoId;
//    private CandidateLevel candidateLevelByCandidateLevelId;
//
//    @Id
//    @Column(name = "vacancy_info_id", nullable = false)
//    public int getVacancyInfoId() {
//        return vacancyInfoId;
//    }
//
//    public void setVacancyInfoId(int vacancyInfoId) {
//        this.vacancyInfoId = vacancyInfoId;
//    }
//
//    @Id
//    @Column(name = "user_info_id", nullable = false)
//    public int getUserInfoId() {
//        return userInfoId;
//    }
//
//    public void setUserInfoId(int userInfoId) {
//        this.userInfoId = userInfoId;
//    }
//
//    @Basic
//    @Column(name = "comment", nullable = true, length = 45)
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    @Basic
//    @Column(name = "approve", nullable = true)
//    public Boolean getApprove() {
//        return approve;
//    }
//
//    public void setApprove(Boolean approve) {
//        this.approve = approve;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        VacancyInfoHasUserInfo that = (VacancyInfoHasUserInfo) o;
//
//        if (vacancyInfoId != that.vacancyInfoId) return false;
//        if (userInfoId != that.userInfoId) return false;
//        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
//        if (approve != null ? !approve.equals(that.approve) : that.approve != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = vacancyInfoId;
//        result = 31 * result + userInfoId;
//        result = 31 * result + (comment != null ? comment.hashCode() : 0);
//        result = 31 * result + (approve != null ? approve.hashCode() : 0);
//        return result;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "vacancy_info_id", referencedColumnName = "id", nullable = false)
//    public VacancyInfo getVacancyInfoByVacancyInfoId() {
//        return vacancyInfoByVacancyInfoId;
//    }
//
//    public void setVacancyInfoByVacancyInfoId(VacancyInfo vacancyInfoByVacancyInfoId) {
//        this.vacancyInfoByVacancyInfoId = vacancyInfoByVacancyInfoId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "user_info_id", referencedColumnName = "id", nullable = false)
//    public UserInfo getUserInfoByUserInfoId() {
//        return userInfoByUserInfoId;
//    }
//
//    public void setUserInfoByUserInfoId(UserInfo userInfoByUserInfoId) {
//        this.userInfoByUserInfoId = userInfoByUserInfoId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "candidate_level_id", referencedColumnName = "id")
//    public CandidateLevel getCandidateLevelByCandidateLevelId() {
//        return candidateLevelByCandidateLevelId;
//    }
//
//    public void setCandidateLevelByCandidateLevelId(CandidateLevel candidateLevelByCandidateLevelId) {
//        this.candidateLevelByCandidateLevelId = candidateLevelByCandidateLevelId;
//    }
//}
