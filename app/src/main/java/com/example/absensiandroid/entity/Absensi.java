
package com.example.absensiandroid.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Absensi implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("dataFoto")
    @Expose
    private String dataFoto;
    @SerializedName("tanggalMasuk")
    @Expose
    private String tanggalMasuk;
    @SerializedName("tanggalKeluar")
    @Expose
    private String tanggalKeluar;
    @SerializedName("lokasiGps")
    @Expose
    private String lokasiGps;
    public final static Creator<Absensi> CREATOR = new Creator<Absensi>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Absensi createFromParcel(android.os.Parcel in) {
            return new Absensi(in);
        }

        public Absensi[] newArray(int size) {
            return (new Absensi[size]);
        }

    }
    ;
    private final static long serialVersionUID = 959005030548643083L;

    protected Absensi(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.dataFoto = ((String) in.readValue((String.class.getClassLoader())));
        this.tanggalMasuk = ((String) in.readValue((String.class.getClassLoader())));
        this.tanggalKeluar = ((String) in.readValue((String.class.getClassLoader())));
        this.lokasiGps = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Absensi() {
    }

    /**
     * 
     * @param tanggalMasuk
     * @param dataFoto
     * @param tanggalKeluar
     * @param id
     * @param lokasiGps
     * @param username
     */
    public Absensi(Integer id, String username, String dataFoto, String tanggalMasuk, String tanggalKeluar, String lokasiGps) {
        super();
        this.id = id;
        this.username = username;
        this.dataFoto = dataFoto;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
        this.lokasiGps = lokasiGps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDataFoto() {
        return dataFoto;
    }

    public void setDataFoto(String dataFoto) {
        this.dataFoto = dataFoto;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getLokasiGps() {
        return lokasiGps;
    }

    public void setLokasiGps(String lokasiGps) {
        this.lokasiGps = lokasiGps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Absensi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("dataFoto");
        sb.append('=');
        sb.append(((this.dataFoto == null)?"<null>":this.dataFoto));
        sb.append(',');
        sb.append("tanggalMasuk");
        sb.append('=');
        sb.append(((this.tanggalMasuk == null)?"<null>":this.tanggalMasuk));
        sb.append(',');
        sb.append("tanggalKeluar");
        sb.append('=');
        sb.append(((this.tanggalKeluar == null)?"<null>":this.tanggalKeluar));
        sb.append(',');
        sb.append("lokasiGps");
        sb.append('=');
        sb.append(((this.lokasiGps == null)?"<null>":this.lokasiGps));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.tanggalMasuk == null)? 0 :this.tanggalMasuk.hashCode()));
        result = ((result* 31)+((this.dataFoto == null)? 0 :this.dataFoto.hashCode()));
        result = ((result* 31)+((this.tanggalKeluar == null)? 0 :this.tanggalKeluar.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lokasiGps == null)? 0 :this.lokasiGps.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Absensi) == false) {
            return false;
        }
        Absensi rhs = ((Absensi) other);
        return (((((((this.tanggalMasuk == rhs.tanggalMasuk)||((this.tanggalMasuk!= null)&&this.tanggalMasuk.equals(rhs.tanggalMasuk)))&&((this.dataFoto == rhs.dataFoto)||((this.dataFoto!= null)&&this.dataFoto.equals(rhs.dataFoto))))&&((this.tanggalKeluar == rhs.tanggalKeluar)||((this.tanggalKeluar!= null)&&this.tanggalKeluar.equals(rhs.tanggalKeluar))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lokasiGps == rhs.lokasiGps)||((this.lokasiGps!= null)&&this.lokasiGps.equals(rhs.lokasiGps))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(username);
        dest.writeValue(dataFoto);
        dest.writeValue(tanggalMasuk);
        dest.writeValue(tanggalKeluar);
        dest.writeValue(lokasiGps);
    }

    public int describeContents() {
        return  0;
    }

}
