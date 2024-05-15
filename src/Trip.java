

import java.util.Date;

public class Trip {
    private int tripId;
    private String destination;
    private String source;
    private Date startDate;
    private Date endDate;

    public Trip(int tripId, String destination, String source, Date startDate, Date endDate) {
        this.tripId = tripId;
        this.destination = destination;
        this.source = source;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    Trip(int i, String makkah, String trip_1) {
      this.tripId = tripId;
      this.destination = destination;
      this.source = source;
    }
    

    Trip(String tripId, String destination, String source, String startDate, String endDate) {
       
    }

    @Override
    public String toString() {
        return "Trip{" + "tripId=" + tripId + ", destination=" + destination + ", source=" + source + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
}