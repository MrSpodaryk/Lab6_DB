//package ua.lviv.iot.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ua.lviv.iot.domain.VacancyInfoHasUserInfo;
//import ua.lviv.iot.repository.VacancyInfoHasUserInfoRepository;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//public class VacancyInfoHasUserInfoService {
//
//    @Autowired
//    VacancyInfoHasUserInfoRepository repository;
//
//    public List<VacancyInfoHasUserInfo> getAllVacancyInfoHasUserInfo() {
//        return repository.findAll();
//    }
//
//    public VacancyInfoHasUserInfo getVacancyInfoHasUserInfo(Integer id) throws Exception {
//        VacancyInfoHasUserInfo VacancyInfoHasUserInfo = repository.findById(id).get();
//        if (VacancyInfoHasUserInfo == null) throw new Exception();
//        return VacancyInfoHasUserInfo;
//    }
//
//    @Transactional
//    public void createVacancyInfoHasUserInfo(VacancyInfoHasUserInfo VacancyInfoHasUserInfo) {
//        repository.save(VacancyInfoHasUserInfo);
//    }
//
//    @Transactional
//    public void updateVacancyInfoHasUserInfo(VacancyInfoHasUserInfo uVacancyInfoHasUserInfo, Integer userId, Integer vacancyId) throws Exception {
//        //VacancyInfoHasUserInfo VacancyInfoHasUserInfo = repository.findById(id).get();
//        VacancyInfoHasUserInfo VacancyInfoHasUserInfo = repository.findById(userId).get();
//        if (VacancyInfoHasUserInfo == null) throw new Exception();
//        VacancyInfoHasUserInfo.setApprove(uVacancyInfoHasUserInfo.getApprove());
//        VacancyInfoHasUserInfo.setComment(uVacancyInfoHasUserInfo.getComment());
//        VacancyInfoHasUserInfo.setCandidateLevelByCandidateLevelId(uVacancyInfoHasUserInfo.getCandidateLevelByCandidateLevelId());
//        repository.save(VacancyInfoHasUserInfo);
//    }
//
//    @Transactional
//    public void deleteVacancyInfoHasUserInfo(Integer id) throws Exception {
//        VacancyInfoHasUserInfo VacancyInfoHasUserInfo = repository.findById(id).get();
//        if (VacancyInfoHasUserInfo == null) throw new Exception();
//        repository.delete(VacancyInfoHasUserInfo);
//    }
//}
