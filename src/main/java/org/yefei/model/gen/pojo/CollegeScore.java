package org.yefei.model.gen.pojo;

public class CollegeScore {
    private Integer id;

    private Integer schoolID;

    private String schoolName;

    private String provice;

    private Integer specialID;

    private String specialName;

    private String batchName;

    private Integer year;

    private Integer score;

    private Integer scoreLineBatch2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice == null ? null : provice.trim();
    }

    public Integer getSpecialID() {
        return specialID;
    }

    public void setSpecialID(Integer specialID) {
        this.specialID = specialID;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName == null ? null : specialName.trim();
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreLineBatch2() {
        return scoreLineBatch2;
    }

    public void setScoreLineBatch2(Integer scoreLineBatch2) {
        this.scoreLineBatch2 = scoreLineBatch2;
    }
}