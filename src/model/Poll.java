package model;

public class Poll{

private int service;
private int answerTime;
private int relationCB;

public Poll(int service,int answerTime,int relationCB){
  this.service = service;
  this.answerTime = answerTime;
  this.relationCB = relationCB;
}

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(int answerTime) {
        this.answerTime = answerTime;
    }

    public int getRelationCB() {
        return relationCB;
    }

    public void setRelationCB(int relationCB) {
        this.relationCB = relationCB;
    }

    @Override
    public String toString() {
        return "Poll [answerTime=" + answerTime + ", relationCB=" + relationCB + ", service=" + service + "]";
    }



}