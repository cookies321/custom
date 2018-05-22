package com.holyrobot.bean;

public class CusCusinfoDest {
    private String id;

    private String cusCusinfoid;

    private String destid;

    private String destination;

    public CusCusinfoDest() {
    }

    public CusCusinfoDest(String id, String cusCusinfoid, String destid, String destination) {
        this.id = id;
        this.cusCusinfoid = cusCusinfoid;
        this.destid = destid;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCusCusinfoid() {
        return cusCusinfoid;
    }

    public void setCusCusinfoid(String cusCusinfoid) {
        this.cusCusinfoid = cusCusinfoid == null ? null : cusCusinfoid.trim();
    }

    public String getDestid() {
        return destid;
    }

    public void setDestid(String destid) {
        this.destid = destid == null ? null : destid.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }
}