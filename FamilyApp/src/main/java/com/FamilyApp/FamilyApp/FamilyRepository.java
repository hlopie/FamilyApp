package com.FamilyApp.FamilyApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class FamilyRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Family> GetAllFamily() {

        List<Family> query = jdbcTemplate.query("SELECT * FROM family", BeanPropertyRowMapper.newInstance(Family.class));
        return query;
    }

    public Family GetFamily(int id) {
        return jdbcTemplate.queryForObject("SELECT familyName, id, nrOfAdults, nrOfChildren, nrOfInfants FROM family WHERE " +
                "id = ?", BeanPropertyRowMapper.newInstance(Family.class), id);

    }

    public List<FamilyMember> GetAllFamilyMembers() {
        List<FamilyMember> query = jdbcTemplate.query("SELECT * FROM familymember", BeanPropertyRowMapper.newInstance(FamilyMember.class));
        return query;
    }

    public List<FamilyMember> GetFamilyMembers(int familyID) {
        List<FamilyMember> query = jdbcTemplate.query("SELECT * FROM familymember WHERE " +
                "familyID = ?", BeanPropertyRowMapper.newInstance(FamilyMember.class), familyID);
        return query;
    }

    public int addFamily(List<Family> families){
        families.forEach(family -> jdbcTemplate.update("INSERT INTO family(familyName, nrOfAdults, nrOfChildren, nrOfInfants) VALUES(?, ?, ?, ?) ",
                                                        family.getFamilyName(), family.getNrOfAdults(), family.getNrOfChildren(), family.getNrOfInfants()));
        return 1;
    }

    public int addFamilyMembers(List<FamilyMember> members){
        members.forEach(member -> jdbcTemplate.update("INSERT INTO familymember(familyID, familyName, givenName) VALUES(?, ?, ?) ",
                member.getFamilyID(), member.getFamilyName(), member.getGivenName()));
        return 1;
    }

    public int deleteFamily(int id) {
        return jdbcTemplate.update("Delete FROM family WHERE " + "id = ?", id);
    }

    public int deleteFamilyMember(int id) {
        return jdbcTemplate.update("Delete FROM familymember WHERE " + "id = ?", id);
    }

}