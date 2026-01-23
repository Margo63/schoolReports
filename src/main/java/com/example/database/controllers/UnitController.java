package com.example.database.controllers;


import com.example.database.dto.*;
import com.example.database.enteties.*;
import com.example.database.repositories.*;
import com.example.database.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/unit")
public class UnitController {
    @Autowired
    MainInfoRepository mainInfoRepository;

    @Autowired
    ContactInfoRepository contactInfoRepository;

    @Autowired
    Unit1Repository unit1Repository;

    @Autowired
    Unit2Repository unit2Repository;

    @Autowired
    Unit3Service unit3Service;

    @Autowired
    Unit4Service unit4Service;

    @Autowired
    Unit5Service unit5Service;

    @Autowired
    Unit6Service unit6Service;
    @Autowired
    Unit7Service unit7Service;

    @Autowired
    Unit8Service unit8Service;

    @Autowired
    Unit9Repository unit9Repository;

    @Autowired
    Unit10Repository unit10Repository;
    @Autowired
    Unit11Repository unit11Repository;

    @Autowired
    Unit12Repository unit12Repository;

    @Autowired
    Unit13Repository unit13Repository;

    @Autowired
    Unit14Repository unit14Repository;

    @Autowired
    Unit15Repository unit15Repository;

    @Autowired
    Unit16Repository unit16Repository;
    @Autowired
    Unit17Repository unit17Repository;

    @Autowired
    Unit18Repository unit18Repository;

    @PostMapping("initReference")
    ResponseEntity<ReferenceResponse> initReference(@RequestBody MainInfo mainInfo) {
        mainInfoRepository.save(mainInfo);
        contactInfoRepository.save(new ContactInformation(mainInfo.getId()));

        unit1Repository.save(new Unit1(mainInfo.getId()));
        unit2Repository.save(new Unit2(mainInfo.getId()));
        unit3Service.save(new Unit3(mainInfo.getId()));
        unit4Service.save(new Unit4(mainInfo.getId()));
        unit5Service.save(new Unit5(mainInfo.getId()));
        unit6Service.save(new Unit6(mainInfo.getId()));
        unit7Service.save(new Unit7(mainInfo.getId()));
        unit8Service.save(new Unit8(mainInfo.getId()));
        unit9Repository.save(new Unit9(mainInfo.getId()));
        unit10Repository.save(new Unit10(mainInfo.getId()));
        unit11Repository.save(new Unit11(mainInfo.getId()));
        unit12Repository.save(new Unit12(mainInfo.getId()));
        unit13Repository.save(new Unit13(mainInfo.getId()));
        unit14Repository.save(new Unit14(mainInfo.getId()));
        unit15Repository.save(new Unit15(mainInfo.getId()));
        unit16Repository.save(new Unit16(mainInfo.getId()));
        unit17Repository.save(new Unit17(mainInfo.getId()));
        unit18Repository.save(new Unit18(mainInfo.getId()));
        return ResponseEntity.ok(new ReferenceResponse(mainInfo.getId()));
    }

    @GetMapping("getReportUnit1")
    ResponseEntity<Unit1Response> getReportUnit1(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit1Repository.sumAllByOrganizationName(organizationName));
    }
    @GetMapping("getReportUnit3")
    ResponseEntity<Unit3And5Response> getReportUnit3(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit3Service.sumAllByOrganizationName(organizationName));
    }

    @GetMapping("getReportUnit4")
    ResponseEntity<Unit4Response> getReportUnit4(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit4Service.sumAllByOrganizationName(organizationName));
    }
    @GetMapping("getReportUnit5")
    ResponseEntity<Unit3And5Response> getReportUnit5(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit5Service.sumAllByOrganizationName(organizationName));
    }
    @GetMapping("getReportUnit6")
    ResponseEntity<Unit6Response> getReportUnit6(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit6Service.sumAllByOrganizationName(organizationName));
    }
    @GetMapping("getReportUnit7")
    ResponseEntity<Unit7Response> getReportUnit7(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit7Service.sumAllByOrganizationName(organizationName));
    }
    @GetMapping("getReportUnit8")
    ResponseEntity<Unit8Response> getReportUnit8(@RequestParam String organizationName) {
        return ResponseEntity.ok(unit8Service.sumAllByOrganizationName(organizationName));
    }



    @GetMapping("getMainInfoList")
    ResponseEntity<Page<MainInfo>> getMainInfo(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        Page<MainInfo> result = mainInfoRepository.findAllProjected(pageable);
        if (result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("getContactInfo")
    ResponseEntity<ContactInformation> getContactInfoById(Long id) {
        return ResponseEntity.ok(contactInfoRepository.findById(id).get());
    }

    @GetMapping("getMainInfo")
    ResponseEntity<MainInfo> getMainInfoById(Long id) {
        return ResponseEntity.ok(mainInfoRepository.findById(id).get());
    }

    @GetMapping("getUnit1")
    ResponseEntity<Unit1> getUnit1ById(Long id) {
        return ResponseEntity.ok(unit1Repository.findById(id).get());
    }

    @GetMapping("getUnit2")
    ResponseEntity<Unit2> getUnit2ById(Long id) {
        return ResponseEntity.ok(unit2Repository.findById(id).get());
    }

    @GetMapping("getUnit3")
    ResponseEntity<Unit3> getUnit3ById(Long id) {
        return ResponseEntity.ok(unit3Service.findById(id));
    }

    @GetMapping("getUnit4")
    ResponseEntity<Unit4> getUnit4ById(Long id) {
        return ResponseEntity.ok(unit4Service.findById(id));
    }

    @GetMapping("getUnit5")
    ResponseEntity<Unit5> getUnit5ById(Long id) {
        return ResponseEntity.ok(unit5Service.findById(id));
    }

    @GetMapping("getUnit6")
    ResponseEntity<Unit6> getUnit6ById(Long id) {
        return ResponseEntity.ok(unit6Service.findById(id));
    }

    @GetMapping("getUnit7")
    ResponseEntity<Unit7> getUnit7ById(Long id) {
        return ResponseEntity.ok(unit7Service.findById(id));
    }

    @GetMapping("getUnit8")
    ResponseEntity<Unit8> getUnit8ById(Long id) {
        return ResponseEntity.ok(unit8Service.findById(id));
    }

    @GetMapping("getUnit9")
    ResponseEntity<Unit9> getUnit9ById(Long id) {
        return ResponseEntity.ok(unit9Repository.findById(id).get());
    }

    @GetMapping("getUnit10")
    ResponseEntity<Unit10> getUnit10ById(Long id) {
        return ResponseEntity.ok(unit10Repository.findById(id).get());
    }

    @GetMapping("getUnit11")
    ResponseEntity<Unit11> getUnit11ById(Long id) {
        return ResponseEntity.ok(unit11Repository.findById(id).get());
    }

    @GetMapping("getUnit12")
    ResponseEntity<Unit12> getUnit12ById(Long id) {
        return ResponseEntity.ok(unit12Repository.findById(id).get());
    }

    @GetMapping("getUnit13")
    ResponseEntity<Unit13> getUnit13ById(Long id) {
        return ResponseEntity.ok(unit13Repository.findById(id).get());
    }

    @GetMapping("getUnit14")
    ResponseEntity<Unit14> getUnit14ById(Long id) {
        return ResponseEntity.ok(unit14Repository.findById(id).get());
    }

    @GetMapping("getUnit15")
    ResponseEntity<Unit15> getUnit15ById(Long id) {
        return ResponseEntity.ok(unit15Repository.findById(id).get());
    }

    @GetMapping("getUnit16")
    ResponseEntity<Unit16> getUnit16ById(Long id) {
        return ResponseEntity.ok(unit16Repository.findById(id).get());
    }

    @GetMapping("getUnit17")
    ResponseEntity<Unit17> getUnit17ById(Long id) {
        return ResponseEntity.ok(unit17Repository.findById(id).get());
    }

    @GetMapping("getUnit18")
    ResponseEntity<Unit18> getUnit18ById(Long id) {
        return ResponseEntity.ok(unit18Repository.findById(id).get());
    }


    @PutMapping("updateMainInfo")
    ResponseEntity<String> updateMainInfo(@RequestBody MainInfo mainInfo) {
        mainInfoRepository.save(mainInfo);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateContactInfo")
    ResponseEntity<String> updateContactInfo(@RequestBody ContactInformation contactInformation) {
        contactInfoRepository.save(contactInformation);
        return ResponseEntity.ok("Updated");
    }
    @PutMapping("updateUnit1")
    ResponseEntity<String> updateUnit1(@RequestBody Unit1 unit1) {
        unit1Repository.save(unit1);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit2")
    ResponseEntity<String> updateUnit2(@RequestBody Unit2 unit2) {

        unit2Repository.save(unit2);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit3")
    ResponseEntity<String> updateUnit3(@RequestBody Unit3 unit3) {

        unit3Service.save(unit3);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit4")
    ResponseEntity<String> updateUnit4(@RequestBody Unit4 unit4) {
        unit4Service.save(unit4);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit5")
    ResponseEntity<String> updateUnit5(@RequestBody Unit5 unit5) {

        unit5Service.save(unit5);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit6")
    ResponseEntity<String> updateUnit6(@RequestBody Unit6 unit6) {

        unit6Service.save(unit6);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit7")
    ResponseEntity<String> updateUnit7(@RequestBody Unit7 unit7) {
        unit7Service.save(unit7);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit8")
    ResponseEntity<String> updateUnit8(@RequestBody Unit8 unit8) {

        unit8Service.save(unit8);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit9")
    ResponseEntity<String> updateUnit9(@RequestBody Unit9 unit9) {

        unit9Repository.save(unit9);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit10")
    ResponseEntity<String> updateUnit10(@RequestBody Unit10 unit10) {
        unit10Repository.save(unit10);
        return ResponseEntity.ok("Updated");
    }
    @PutMapping("updateUnit11")
    ResponseEntity<String> updateUnit11(@RequestBody Unit11 unit11) {
        unit11Repository.save(unit11);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit12")
    ResponseEntity<String> updateUnit12(@RequestBody Unit12 unit12) {

        unit12Repository.save(unit12);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit13")
    ResponseEntity<String> updateUnit13(@RequestBody Unit13 unit13) {

        unit13Repository.save(unit13);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit14")
    ResponseEntity<String> updateUnit14(@RequestBody Unit14 unit14) {
        unit14Repository.save(unit14);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit15")
    ResponseEntity<String> updateUnit15(@RequestBody Unit15 unit15) {

        unit15Repository.save(unit15);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit16")
    ResponseEntity<String> updateUnit16(@RequestBody Unit16 unit16) {

        unit16Repository.save(unit16);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit17")
    ResponseEntity<String> updateUnit17(@RequestBody Unit17 unit17) {
        unit17Repository.save(unit17);
        return ResponseEntity.ok("Updated");
    }

    @PutMapping("updateUnit18")
    ResponseEntity<String> updateUnit18(@RequestBody Unit18 unit18) {

        unit18Repository.save(unit18);
        return ResponseEntity.ok("Updated");
    }

}
