package com.tw.service;

import com.tw.entity.GradeReportBuilder;
import com.tw.entity.Gradereport;
import com.tw.entity.Klass;
import com.tw.entity.StudentInfo;

import java.util.List;

public class StudentGradeService {

    private Klass klass;
    private GradeReportBuilder gradeReportBuilder;

    public StudentGradeService(Klass klass, GradeReportBuilder gradeReportBuilder) {

        this.klass = klass;
        this.gradeReportBuilder = gradeReportBuilder;
    }

    public void addStudent(StudentInfo stu) {
        this.klass.addStudents(stu);
    }

    public Gradereport generateReport(List<StudentInfo> stuList) {
        return this.gradeReportBuilder.buildIndicatedStuReport(stuList);
    }
}
