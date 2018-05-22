package com.holyrobot.bean;

public class CusCusinfoServicetype {
    private String id;

    private String cusCusinfoid;

    private String serviertypeid;

    public CusCusinfoServicetype() {
    }

    public CusCusinfoServicetype(String id, String cusCusinfoid, String serviertypeid) {
        this.id = id;
        this.cusCusinfoid = cusCusinfoid;
        this.serviertypeid = serviertypeid;
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

    public String getServiertypeid() {
        return serviertypeid;
    }

    public void setServiertypeid(String serviertypeid) {
        this.serviertypeid = serviertypeid == null ? null : serviertypeid.trim();
    }
}