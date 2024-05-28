package com.pab.androidclientserver;

public class User {
    private int id;
    private String name;
    private String email;
    private String alamat;
    private String prodi;
    public User(String name, String email, String alamat, String prodi) {
        this.name = name;
        this.email = email;
        this.alamat = alamat;
        this.prodi = prodi; }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAlamat() { return alamat; }
    public String getProdi() { return prodi; }
}
