import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IpLocation {

   private String ip;
   private String hostname;
   private String city;
   private String country;
   private String region;
   private String loc;
   private String postal;
   private String  timeZone;


   public String getIp() {
      return ip;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getHostname() {
      return hostname;
   }

   public void setHostname(String hostname) {
      this.hostname = hostname;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getRegion() {
      return region;
   }

   public void setRegion(String region) {
      this.region = region;
   }

   public String getLoc() {
      return loc;
   }

   public void setLoc(String loc) {
      this.loc = loc;
   }

   public String getPostal() {
      return postal;
   }

   public void setPostal(String postal) {
      this.postal = postal;
   }

   public String getTimeZone() {
      return timeZone;
   }

   public void setTimeZone(String timeZone) {
      this.timeZone = timeZone;
   }

   @Override
   public String toString() {
      return "IpLocation{" +
              "ip='" + ip + '\'' +
              ", hostname='" + hostname + '\'' +
              ", city='" + city + '\'' +
              ", country='" + country + '\'' +
              ", region='" + region + '\'' +
              ", loc='" + loc + '\'' +
              ", postal='" + postal + '\'' +
              ", timeZone='" + timeZone + '\'' +
              '}';
   }
}
