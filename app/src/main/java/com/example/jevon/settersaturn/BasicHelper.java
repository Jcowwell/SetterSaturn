package com.example.jevon.settersaturn;

/**
 * Created by Jevon on 4/15/18.
 */

public class BasicHelper {


//    Enum Classes for Courses.java

//    Days Enum

    enum Days {
        Monday{
            @Override
            public String toString() {
                return "M";
            }
        },
        Tuesday{
            @Override
            public String toString() {
                return "T";
            }
        },
        Wednesday{
            @Override
            public String toString() {
                return "W";
            }
        },
        Thursday{
            @Override
            public String toString() {
                return "R";
            }
        },
        Friday{
            @Override
            public String toString() {
                return "F";
            }
        },
        Saturday{
            @Override
            public String toString() {
                return "S";
            }
        },
        Sunday{
            @Override
            public String toString() {
                return "U";
            }
        },
    }

//    School Enum

    public enum School {
        Dyson {
            @Override
            public String toString() {
                return "Dyson College of Arts & Science";
            }
        },
        Education {
            @Override
            public String toString() {
                return "School of Education";
            }
        },
        HealthProfessions {
            @Override
            public String toString() {
                return "College of Health Professions";
            }
        },
        Law {
            @Override
            public String toString() {
                return "School of Law";
            }
        },
        Lubin {
            @Override
            public String toString() {
                return "Lubin School of Business";
            }
        },
        Seidenburg {
            @Override
            public String toString() {
                return "Seidenburg School OF CSIS";
            }
        }
    }

//    Schedule Type Enum

    enum ScheduleType {
        BDP {
            @Override
            public String toString() {
                return "Bachelor's Degree Program";
            }
        },
        CNP {
            @Override
            public String toString() {
                return "Children's Non Credit Program";
            }
        },
        CLK {
            @Override
            public String toString() {
                return "Clerkship";
            }
        },
        CLC {
            @Override
            public String toString() {
                return "Clinical";
            }
        },
        CLT {
            @Override
            public String toString() {
                return "Clout";
            }
        },
        CLQ {
            @Override
            public String toString() {
                return "Colloquium";
            }
        },
        DIS {
            @Override
            public String toString() {
                return "Discussion";
            }
        },
        EXT {
            @Override
            public String toString() {
                return "Externship";
            }
        },
        FSM {
            @Override
            public String toString() {
                return "Free Seminar";
            }
        },
        IND {
            @Override
            public String toString() {
                return "Independent Study";
            }
        },
        INT {
            @Override
            public String toString() {
                return "Internship";
            }
        },
        LAB {
            @Override
            public String toString() {
                return "Laboratory";
            }
        },
        LBR {
            @Override
            public String toString() {
                return "Laboratory Graded";
            }
        },
        LEC {
            @Override
            public String toString() {
                return "Lecture";
            }
        },
        MEM {
            @Override
            public String toString() {
                return "Membership";
            }
        },
        MTC {
            @Override
            public String toString() {
                return "Moot Court";
            }
        },
        NAC {
            @Override
            public String toString() {
                return "Nactel";
            }
        },
        NCW {
            @Override
            public String toString() {
                return "Non Credit Workshop";
            }
        },
        NCO {
            @Override
            public String toString() {
                return "Non Credit with Organization";
            }
        },
        NCC {
            @Override
            public String toString() {
                return "Non-Credit Course";
            }
        },
        OC {
            @Override
            public String toString() {
                return "Off Campus";
            }
        },
        OCA {
            @Override
            public String toString() {
                return "Off Campus";
            }
        },
        WWW {
            @Override
            public String toString() {
                return "Online Course";
            }
        },
        PE {
            @Override
            public String toString() {
                return "Physical Education";
            }
        },
        PRA {
            @Override
            public String toString() {
                return "Practicum";
            }
        },
        PRV {
            @Override
            public String toString() {
                return "Private";
            }
        },
        SER{
            @Override
            public String toString() {
                return "Series";
            }
        },
        SEM {
            @Override
            public String toString() {
                return "Seminar";
            }
        },
        SIM {
            @Override
            public String toString() {
                return "Simulation";
            }
        },
        SKD {
            @Override
            public String toString() {
                return "Skills Development";
            }
        },
        SPC {
            @Override
            public String toString() {
                return "Special";
            }
        },
        TCH {
            @Override
            public String toString() {
                return "Student Teaching";
            }
        },
        SDO {
            @Override
            public String toString() {
                return "Studio";
            }
        },
        TRP {
            @Override
            public String toString() {
                return "Thesis/Research Project";
            }
        },
        TUT {
            @Override
            public String toString() {
                return "Tutorial";
            }
        },
        VC {
            @Override
            public String toString() {
                return "Video Conference";
            }
        },
        WA {
            @Override
            public String toString() {
                return "Web-Assisted";
            }
        },
        WRK {
            @Override
            public String toString() {
                return "Workshop";
            }
        },
    }

}
