package com.example.myapplication26;

public class board_list {
    private long id;
    private String date;
    private String time;
    private String train;

    public board_list(long id, String date, String time, String train) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.train = train;
    }

    public board_list()
    {}
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String name){
        this.date = date;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String name){
        this.time = name;
    }
    public String getTrain(){
        return train;
    }
    public void setPassword(String name){
        this.time = time;
    }

    @Override
    public String toString() {
        return "Contact{ " +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", train='" +train+ '\'' + '}';
    }

}
