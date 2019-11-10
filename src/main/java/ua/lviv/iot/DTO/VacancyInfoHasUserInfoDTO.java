//package ua.lviv.iot.DTO;
//
//import org.springframework.hateoas.Link;
//import org.springframework.hateoas.ResourceSupport;
//import ua.lviv.iot.domain.CandidateLevel;
//import ua.lviv.iot.domain.VacancyInfoHasUserInfo;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Id;
//
//public class VacancyInfoHasUserInfoDTO  extends ResourceSupport {
//
//    private VacancyInfoHasUserInfo vacancyInfoHasUserInfo;
//
//    public VacancyInfoHasUserInfoDTO(VacancyInfoHasUserInfo vacancyInfoHasUserInfo, Link selfLink) throws Exception {
//        this.vacancyInfoHasUserInfo = vacancyInfoHasUserInfo;
//        add(selfLink);
//    }
//
//    public int getVacancyInfoId() {
//        return vacancyInfoHasUserInfo.getVacancyInfoId();
//    }
//
//    public int getUserInfoId() {
//        return vacancyInfoHasUserInfo.getUserInfoId();
//    }
//
//    public String getComment() {
//        return vacancyInfoHasUserInfo.getComment();
//    }
//
//     public Boolean getApprove() {
//        return vacancyInfoHasUserInfo.getApprove();
//    }
//
//}
