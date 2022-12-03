package com.FamilyApp.FamilyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FamilyController {
    @Autowired
    FamilyRepository familyRepository;

    @GetMapping("/family") // Returns list of Families
    public List<Family> GetAllFamily(){
        return familyRepository.GetAllFamily();
    }

    @GetMapping("/family/{id}") // Returns only one Family by id
    public Family GetFamily(@PathVariable("id") int id){
        return (Family) familyRepository.GetFamily(id);
    };

    @GetMapping("/familymembers") // Returns list of all familymembers
    public List<FamilyMember> GetAllFamilyMembers(){
        return familyRepository.GetAllFamilyMembers();
    }

    @GetMapping("/familymembers/{id}") // Returns all members from family by id
    public List<FamilyMember> GetFamilyMembers(@PathVariable("id") int id) {
        return familyRepository.GetFamilyMembers(id);
    }

    @PostMapping("/family")
    public int addFamily(@RequestBody List<Family> families){
        return familyRepository.addFamily(families);
    }

    @PostMapping("/familymembers")
    public int addFamilyMember(@RequestBody List<FamilyMember> members){
        return familyRepository.addFamilyMembers(members);
    }

    @DeleteMapping("/family/{id}")
    public int deleteFamily(@PathVariable("id") int id) {
        return familyRepository.deleteFamily(id);
    }

    @DeleteMapping("familymembers/{id}")
    public int deleteFamilyMember(@PathVariable("id") int id){
        return familyRepository.deleteFamilyMember(id);
    }
}
