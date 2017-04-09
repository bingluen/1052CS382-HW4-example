package cs382.TA_Assignment4;

public class Grade {
    private String id;
    private String name;
    private int lab1, lab2, lab3, midTerm, finalExam;

    public Grade() {
        // TODO Auto-generated constructor stub
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }
    public void setLab1(int lab1) {
        this.lab1 = lab1;
    }
    public void setLab2(int lab2) {
        this.lab2 = lab2;
    }
    public void setLab3(int lab3) {
        this.lab3 = lab3;
    }
    public void setMidTerm(int midTerm) {
        this.midTerm = midTerm;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFinalExam() {
        return finalExam;
    }
    public String getId() {
        return id;
    }
    public int getLab1() {
        return lab1;
    }
    public int getLab2() {
        return lab2;
    }
    public int getLab3() {
        return lab3;
    }
    public int getMidTerm() {
        return midTerm;
    }
    public String getName() {
        return name;
    }

    public static Grade SimpleFactory(String id, String name, int lab1, int lab2, int lab3, int midTerm, int finalExam) {
        Grade aGrade = new Grade();
        aGrade.setId(id);
        aGrade.setName(name);
        aGrade.setLab1(lab1);
        aGrade.setLab2(lab2);
        aGrade.setLab3(lab3);
        aGrade.setMidTerm(midTerm);
        aGrade.setFinalExam(finalExam);
        return aGrade;
    }
}