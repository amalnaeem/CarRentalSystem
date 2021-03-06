package carrental;
// Generated Apr 28, 2018 6:37:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String address;
     private int contact;
     private String password;
     private String fname;
     private String lname;
     private String type;
     private Set<Booking> bookings = new HashSet<Booking>(0);

    public Users() {
    }

	
    public Users(String username, String address, int contact, String password, String fname, String lname, String type) {
        this.username = username;
        this.address = address;
        this.contact = contact;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.type = type;
    }
    public Users(String username, String address, int contact, String password, String fname, String lname, String type, Set<Booking> bookings) {
       this.username = username;
       this.address = address;
       this.contact = contact;
       this.password = password;
       this.fname = fname;
       this.lname = lname;
       this.type = type;
       this.bookings = bookings;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getContact() {
        return this.contact;
    }
    
    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set<Booking> getBookings() {
        return this.bookings;
    }
    
    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }




}


