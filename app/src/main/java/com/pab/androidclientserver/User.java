package com.pab.androidclientserver;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("nim")
    private String nim;

    @SerializedName("kelas")
    private String kelas;

    @SerializedName("email")
    private String email;

    // Konstruktor untuk membuat objek User baru
    public User(int id, String name, String nim, String kelas, String email) {
        this.id = id;
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.email = email;
    }

    // Konstruktor untuk membuat objek User tanpa id (misalnya, untuk menambahkan user baru)
    public User(String name, String nim, String kelas, String email) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.email = email;
    }

    // Getter untuk mendapatkan id user
    public int getId() {
        return id;
    }

    // Setter untuk mengatur id user
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk mendapatkan nama user
    public String getName() {
        return name;
    }

    // Setter untuk mengatur nama user
    public void setName(String name) {

        this.name = name;
    }

    // Getter untuk mendapatkan nim user
    public String getNim() {
        return nim;
    }

    // Setter untuk mengatur nim user
    public void setNim(String nim) {

        this.nim = nim;
    }

    // Getter untuk mendapatkan kelas user
    public String getKelas() {
        return kelas;
    }

    // Setter untuk mengatur kelas user
    public void setKelas(String kelas) {

        this.kelas = kelas;
    }

    // Getter untuk mendapatkan email user
    public String getEmail() {
        return email;
    }

    // Setter untuk mengatur email user
    public void setEmail(String email) {
        this.email = email;
    }
}
