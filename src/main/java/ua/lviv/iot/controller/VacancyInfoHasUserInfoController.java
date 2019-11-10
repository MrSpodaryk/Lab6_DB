//package ua.lviv.iot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Link;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import ua.lviv.iot.DTO.VacancyInfoHasUserInfoDTO;
//import ua.lviv.iot.domain.VacancyInfoHasUserInfo;
//import ua.lviv.iot.service.VacancyInfoHasUserInfoService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
//
//@RestController
//@RequestMapping("/vacancy_info_has_user_info")
//public class VacancyInfoHasUserInfoController {
//
//    @Autowired
//    VacancyInfoHasUserInfoService service;
//
//    @GetMapping
//    public ResponseEntity<List<VacancyInfoHasUserInfoDTO>> getAllVacancyInfoHasUserInfo() throws Exception {
//        List<VacancyInfoHasUserInfo> VacancyInfoHasUserInfoList = service.getAllVacancyInfoHasUserInfo();
//        Link link = linkTo(methodOn(VacancyInfoHasUserInfoController.class).getAllVacancyInfoHasUserInfo()).withSelfRel();
//
//        List<VacancyInfoHasUserInfoDTO> VacancyInfoHasUserInfoDTOList = new ArrayList<>();
//
//        for (VacancyInfoHasUserInfo entity : VacancyInfoHasUserInfoList) {
//            Link selfLink = new Link(link.getHref() + "/" + entity.getVacancyInfoId() + "/" + entity.getUserInfoId()).withSelfRel();
//            VacancyInfoHasUserInfoDTO dto = new VacancyInfoHasUserInfoDTO(entity, selfLink);
//            VacancyInfoHasUserInfoDTOList.add(dto);
//
//        }
//
//        return new ResponseEntity<>(VacancyInfoHasUserInfoDTOList, HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/{vacancy_info_has_user_info_id}")
//    public ResponseEntity<VacancyInfoHasUserInfoDTO> getVacancyInfoHasUserInfo(@PathVariable Integer vacancy_info_has_user_info_id) throws Exception {
//        VacancyInfoHasUserInfo VacancyInfoHasUserInfo = service.getVacancyInfoHasUserInfo(vacancy_info_has_user_info_id);
//        Link link = linkTo(methodOn(VacancyInfoHasUserInfoController.class).getVacancyInfoHasUserInfo(vacancy_info_has_user_info_id)).withSelfRel();
//
//        VacancyInfoHasUserInfoDTO VacancyInfoHasUserInfoDTO = new VacancyInfoHasUserInfoDTO(VacancyInfoHasUserInfo, link);
//
//        return new ResponseEntity<>(VacancyInfoHasUserInfoDTO, HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<VacancyInfoHasUserInfoDTO> addVacancyInfoHasUserInfo(@RequestBody VacancyInfoHasUserInfo VacancyInfoHasUserInfo) throws Exception {
//        service.createVacancyInfoHasUserInfo(VacancyInfoHasUserInfo);
//        Link link = linkTo(methodOn(VacancyInfoHasUserInfoController.class).getVacancyInfoHasUserInfo(VacancyInfoHasUserInfo.getUserInfoId())).withSelfRel();
//
//        VacancyInfoHasUserInfoDTO VacancyInfoHasUserInfoDTO = new VacancyInfoHasUserInfoDTO(VacancyInfoHasUserInfo, link);
//
//        return new ResponseEntity<>(VacancyInfoHasUserInfoDTO, HttpStatus.CREATED);
//    }
//
//    @PutMapping(value = "/{vacancy_info_has_user_info_id}/{user_info_id}")
//    public ResponseEntity<VacancyInfoHasUserInfoDTO> updateVacancyInfoHasUserInfo(@RequestBody VacancyInfoHasUserInfo uVacancyInfoHasUserInfo, @PathVariable Integer vacancy_info_has_user_info_id, @PathVariable Integer user_info_id) throws Exception {
//        service.updateVacancyInfoHasUserInfo(uVacancyInfoHasUserInfo, vacancy_info_has_user_info_id, user_info_id);
//        VacancyInfoHasUserInfo VacancyInfoHasUserInfo = service.getVacancyInfoHasUserInfo(vacancy_info_has_user_info_id);
//        Link link = linkTo(methodOn(VacancyInfoHasUserInfoController.class).getVacancyInfoHasUserInfo(vacancy_info_has_user_info_id)).withSelfRel();
//
//        VacancyInfoHasUserInfoDTO VacancyInfoHasUserInfoDTO = new VacancyInfoHasUserInfoDTO(VacancyInfoHasUserInfo, link);
//
//        return new ResponseEntity<>(VacancyInfoHasUserInfoDTO, HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/{vacancy_info_has_user_info_id}")
//    public ResponseEntity deleteVacancyInfoHasUserInfo(@PathVariable Integer vacancy_info_has_user_info_id) throws Exception {
//        service.deleteVacancyInfoHasUserInfo(vacancy_info_has_user_info_id);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//}
